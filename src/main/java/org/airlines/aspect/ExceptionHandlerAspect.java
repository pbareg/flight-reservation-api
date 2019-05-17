package org.airlines.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Aspect
@Component
public class ExceptionHandlerAspect {

    @AfterReturning(pointcut="execution(* org.airlines.api.*.*(..))", returning="retVal")
    public void logAroundGetEmployee(Object retVal) {
      if(retVal instanceof ResponseEntity) {
          ResponseEntity<Object> response =(ResponseEntity<Object>) retVal;
          if(null==response.getBody()){
              throw new NullPointerException("No Result found for the resource");
          }
      }
    }
}
