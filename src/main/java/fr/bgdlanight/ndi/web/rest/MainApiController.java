package fr.bgdlanight.ndi.web.rest;

import fr.bgdlanight.ndi.model.Personne;
import fr.bgdlanight.ndi.model.apiresponse.ApiError;
import fr.bgdlanight.ndi.model.apiresponse.ApiResponse;
import lombok.extern.slf4j.Slf4j;
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
    /* Ici on met les services en autowired, comme des beans
    @Autowired
    private ServiceTruc serviceTruc;
     */

    // Méthodes
    @GetMapping(value = "/test")
    public ApiResponse test(
            @RequestParam(value = "code") final int code,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        if (log.isDebugEnabled()) log.debug("Test request.");
        return new ApiResponse(
                "Test request successful.",
                "Le code saisi est " + code
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
