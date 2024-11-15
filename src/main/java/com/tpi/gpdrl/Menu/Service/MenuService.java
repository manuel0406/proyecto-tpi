package com.tpi.gpdrl.Menu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Menu.Repository.MenuRepository;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;
}
