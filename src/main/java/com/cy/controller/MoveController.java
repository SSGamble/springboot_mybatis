package com.cy.controller;

import com.cy.pojo.Move;
import com.cy.service.MoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController    // 控制器
public class MoveController {
    @Autowired
    MoveService moveService;

    @GetMapping(value = "/moves")
    public List<Move> moveLst() throws Exception {
        return moveService.moveLst();
    }
}
