package pet.store.controller.error;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import pet.store.controller.PetStoreController;

@RestControllerAdvice
@Slf4j
public class GlobalErrorHandler { 
	
  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus(code = HttpStatus.NOT_FOUND)
   public Map<String, String> handleNoSuchElementException(NoSuchElementException Ex) { 
	  
	 Map<String, String> errorResponse = new HashMap<>();
	 errorResponse.put("message", Ex.toString());
	 return errorResponse;
  }

}
