<<<<<<< HEAD
package com.abstractfactory.example.domain.ui;

import org.springframework.stereotype.Component;

@Component
public class DarkTextField implements TextField{
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control bg-dark text-light\" placeholder=\"Buscar productos...\">";
    }
}
=======
package com.abstractfactory.example.domain.ui;

import org.springframework.stereotype.Component;

@Component
public class DarkTextField implements TextField{
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control bg-dark text-light\" placeholder=\"Buscar productos...\">";
    }
}
>>>>>>> d17009dd148ebfb13060085144d2031ab1f8599d
