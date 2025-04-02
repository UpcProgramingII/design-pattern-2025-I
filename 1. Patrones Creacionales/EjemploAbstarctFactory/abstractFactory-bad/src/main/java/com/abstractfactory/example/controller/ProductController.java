<<<<<<< HEAD
package com.abstractfactory.example.controller;

import com.abstractfactory.example.domain.model.*;
import com.abstractfactory.example.service.ProductService;
import com.abstractfactory.example.service.UIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;
    private final UIService uiService;

    @Autowired
    public ProductController(ProductService productService, UIService uiService) {
        this.productService = productService;
        this.uiService = uiService;
    }

    @GetMapping("/")
    public String index(@RequestParam(name = "theme") String themeParam, Model model) {

        Theme theme = Theme.valueOf(themeParam.toUpperCase());
        uiService.setTheme(theme);
        List<Product> products = productService.getAllProducts();

        model.addAttribute("products", products);
        model.addAttribute("themeClass", uiService.getThemeClass());
        model.addAttribute("currentTheme", theme.toString());
        model.addAttribute("buttonHtml", uiService.getButtonHtml());
        model.addAttribute("textFieldHtml", uiService.getTextFieldHtml());
        model.addAttribute("tableHtml", uiService.getTableHtml(products));

        return "index";
    }
}
=======
package com.abstractfactory.example.controller;

import com.abstractfactory.example.domain.model.*;
import com.abstractfactory.example.service.ProductService;
import com.abstractfactory.example.service.UIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;
    private final UIService uiService;

    @Autowired
    public ProductController(ProductService productService, UIService uiService) {
        this.productService = productService;
        this.uiService = uiService;
    }

    @GetMapping("/")
    public String index(@RequestParam(name = "theme") String themeParam, Model model) {

        Theme theme = Theme.valueOf(themeParam.toUpperCase());
        uiService.setTheme(theme);
        List<Product> products = productService.getAllProducts();

        model.addAttribute("products", products);
        model.addAttribute("themeClass", uiService.getThemeClass());
        model.addAttribute("currentTheme", theme.toString());
        model.addAttribute("buttonHtml", uiService.getButtonHtml());
        model.addAttribute("textFieldHtml", uiService.getTextFieldHtml());
        model.addAttribute("tableHtml", uiService.getTableHtml(products));

        return "index";
    }
}
>>>>>>> d17009dd148ebfb13060085144d2031ab1f8599d
