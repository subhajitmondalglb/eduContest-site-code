/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edumongoose.controllers;

import com.edumongoose.entity.Program;
import com.edumongoose.compilers.Compiler;
import com.edumongoose.compilers.CompilerClass;
import com.edumongoose.entity.Result;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Admin
 * Controller to handle all mappings related to compiler pages. 
 */
@Controller
@RequestMapping(value = "/compiler")
public class CompilerController {

    //Change this code to store values in a object and pass the object from method
    /**
     *
     * @param program
     * @param result
     * @param model
     * @param request
     * @return
     */
    
    @RequestMapping(value = "compile", method = RequestMethod.POST)
    public String compiler(Program program, BindingResult result, Model model, HttpServletRequest request) {
        Compiler compiler = new Compiler();
        Result programResult;
//        model.addAttribute("output", programResult);
        System.out.println(model.toString());
        Gson gson = new Gson();
//        return gson.toJson(programResult);
        return "";
    }
    
    @RequestMapping(value = "execute", method = RequestMethod.GET)
    public String execute(Program program,HttpServletRequest request) {
        CompilerClass compiler = new CompilerClass();
        Result result = compiler.compiler(program);
        return "solveproblem";
    }
}
