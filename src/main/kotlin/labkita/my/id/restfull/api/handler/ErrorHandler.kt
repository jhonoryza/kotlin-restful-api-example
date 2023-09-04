package labkita.my.id.restfull.api.handler

import jakarta.validation.ConstraintViolationException
import labkita.my.id.restfull.api.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandler {
    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
            code = 400,
            message = "Bad Request",
            data = constraintViolationException.message!!
        )
    }
}