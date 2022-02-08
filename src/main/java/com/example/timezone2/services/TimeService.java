package com.example.timezone2.services;

import com.example.timezone2.models.TimeModel;
import com.example.timezone2.repositories.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TimeService {
    @Autowired
    TimeRepository timeRepository;

    public TimeModel guardarTime(TimeModel time) {
        sumar(time);
        return timeRepository.save(time);

    }

    int resultado;

    public void sumar(TimeModel time) {
        String num1 = time.getTime();
        String num2 = time.getTimezone();
        String num1b = num1.substring(0,2);
        String num3 = "utc";
        int num1a = Integer.parseInt(num1b);
        int num2a = Integer.parseInt(num2);
//        if ( num1 != "" || num2 != "" ) {
            if (num2a > 0 && num1a < 25 && num1a > 0) {
                resultado = num1a + num2a;
            } else {
                resultado = num1a - (-num2a);
            }
            String resultadoa = String.valueOf(resultado);
            time.setTime(resultadoa + num1.substring(2,8));
            time.setTimezone(num3);
//        }
//        else {
//          System.out.print("Falta o atributo no puesto");
//        }
        }
}



