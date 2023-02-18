package co.develhope.logging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Autowired
    Environment environment;

    public Integer getPower(){
        Integer number1 = Integer.valueOf(environment.getProperty("customEnvs.n1"));
        Integer number2 = Integer.valueOf(environment.getProperty("customEnvs.n2"));

        Integer result = 1;

        for (int i=0; i < number2; i++){
            result *= number1;
        }
        return result;
    }
}