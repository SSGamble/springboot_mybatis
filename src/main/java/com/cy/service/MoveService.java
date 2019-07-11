package com.cy.service;

import com.cy.dao.IMoveDao;
import com.cy.pojo.Move;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service    // Service 类
public class MoveService {

    @Autowired
    IMoveDao moveDao;

    public List<Move> moveLst() {
        return moveDao.moveLst();
    }
}
