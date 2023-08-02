package com.javatechnolessons;

import com.javatechnolessons.model.Persona;
import com.javatechnolessons.services.IPersonaService;
import com.javatechnolessons.services.PersonaServiceImp;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona pers1 = new Persona(1, "Gabriel");
        IPersonaService personaService = new PersonaServiceImp();
        personaService.registrar(pers1);
        

    }
}
