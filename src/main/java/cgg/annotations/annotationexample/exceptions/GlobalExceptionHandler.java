package cgg.annotations.annotationexample.exceptions;

import java.net.URI;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public record GlobalExceptionHandler() {
    
    @ExceptionHandler(AgeNotValidException.class)
    public ResponseEntity<ProblemDetail> handleAgeNotValidException(AgeNotValidException ex){
         ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            pd.setTitle(ex.getMessage());
            pd.setDetail("age is not valid to cast vote");
            pd.setType(URI.create("http://localhost:8080/errors"));
            ///
            pd.setProperty("host", "localhost");
            pd.setProperty("port", 8080);
            pd.setProperty("timestamp", LocalDateTime.now());
            return new ResponseEntity<>(pd,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
