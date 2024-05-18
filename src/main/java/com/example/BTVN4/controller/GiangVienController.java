package com.example.BTVN4.controller;

import com.example.BTVN4.entity.GiangVien;
import com.example.BTVN4.service.GiangVienService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/giangVien")
public class GiangVienController {

    GiangVienService giangVienService = new GiangVienService();

    @GetMapping("HienThi")
    public String hienThi(Model model) {
        model.addAttribute("listGV", giangVienService.getAll());
        return "view/ListGiangVien";
    }

    @GetMapping("DeleteGiangVien/{msgv}")
    public String deleteGiangVien(@PathVariable("msgv") String msgv) {
        giangVienService.delete(msgv);
        return "redirect:/giangVien/HienThi";
    }
    @GetMapping("FormAdd")
    public String formAdd(Model model){
        model.addAttribute("giangVien",new GiangVien());
        return "view/AddGiangVien";
    }
    @PostMapping("AddGiangVien")
    public String AddGiangVien(@Valid @ModelAttribute("giangVien") GiangVien giangVien, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "view/AddGiangVien";
        }else{
            giangVienService.add(giangVien);
            return "redirect:/giangVien/HienThi";
        }
    }
}
