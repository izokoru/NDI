package fr.bgdlanight.ndi.web.rest;

import fr.bgdlanight.ndi.model.Personne;
import fr.bgdlanight.ndi.model.apiresponse.ApiError;
import fr.bgdlanight.ndi.model.apiresponse.ApiResponse;
import fr.bgdlanight.ndi.service.db.ServiceDb;
import fr.bgdlanight.ndi.service.db.mysql.ServiceDbMysql;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping(path = "api/")
public class MainApiController {
    // Attributs
    @Autowired
    private ServiceDb serviceDb;

    // Méthodes
    @GetMapping(value = "/test")
    public ApiResponse test(
            @RequestParam(value = "page") final int page,
            @RequestParam(value = "ressourcesPerPage", defaultValue = "32") final int elementsParPage,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        if (log.isDebugEnabled()) log.debug("Test request.");
        return new ApiResponse(
                "Test request successful.",
                null
        );
    }

    @GetMapping(value = "/personne")
    public ApiResponse personne(
            @RequestParam(value = "id") final int id,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {
        if (log.isDebugEnabled()) log.debug("Personne request.");
        return new ApiResponse(
                "Personne request successful.",
                this.serviceDb.getPersonneById(id)
        );
    }

    @GetMapping(value = "/actiondesauvetage")
    public ApiResponse actiondesauvetage(
            @RequestParam(value = "id") final int id,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {
        if (log.isDebugEnabled()) log.debug("Action De Sauvetage request.");
        return new ApiResponse(
                "Action De Sauvetage request successful.",
                this.serviceDb.getActionById(id)
        );
    }

    @GetMapping(value = "/personnes")
    public ApiResponse personnes(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {
        if (log.isDebugEnabled()) log.debug("Personnes request.");
        return new ApiResponse(
                "Personnes request successful.",
                this.serviceDb.getPersonnes()
        );
    }

    @ExceptionHandler({
            MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class
    })
    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
    public ApiResponse handleExceptionMissingParameter(
            HttpServletRequest request,
            HttpServletResponse response,
            Exception exception
    ) {
        return new ApiResponse(
                "Api request failed: bad request.",
                new ApiError(exception)
        );
    }

    @ExceptionHandler(
            Exception.class
    )
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    public ApiResponse handleExceptionElse(
            HttpServletRequest request,
            HttpServletResponse response,
            Exception exception
    ) {
        return new ApiResponse(
                "Api request failed: unknown internal server error.",
                new ApiError(exception)
        );
    }
}
