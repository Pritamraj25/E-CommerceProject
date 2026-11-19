package com.pritamraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pritamraj.Repository.ProductRepository;
import com.pritamraj.entity.Products;
import com.pritamraj.service.ProductService;

import jakarta.validation.Valid;

@Controller
public class ProductsController {
	
	
	@Autowired
	ProductRepository prorepo;
	
	@Autowired
	ProductService productservice;
	
	@GetMapping({"/","/product-form"})
	public String product_form(Model model)
	{
		Products product=new Products();
		model.addAttribute("product",product);
		//product.setName("laptop");
		return "product-form";
	}
	
//	@GetMapping("/products")
//	public String allproduct(Model model)
//	{
//		List<Products>allproduct=productservice.getallproducts();
//		model.addAttribute("products",allproduct);
//		return "products";
//	}
	
	
	
	@GetMapping("/products")
	public String allproduct(@RequestParam(defaultValue = "0") int page,Model model)
	{
		PageRequest of=PageRequest.of(page, 5);
		Page<Products>pages=prorepo.findAll(of);
		model.addAttribute("products", pages.getContent());
		model.addAttribute("currentpage", page);
		model.addAttribute("totalpages", pages.getTotalPages());
		return "products";
	}
	
	
//	@PostMapping("/save")
//	public String save(@Valid @ModelAttribute("product")Products product,BindingResult result,Model model,RedirectAttributes redirect)
//	{
//		if(result.hasErrors())
//		{
//			System.err.println(result);
//			return "product-form";
//		}
//		System.err.println(product);
//		//model.addAttribute("product",new Products());
//		productservice.save(product);
//		//model.addAttribute("msg","Product Saved Successfully");
//		redirect.addFlashAttribute("msg","Product Saved Successfully");
//		return "redirect:/products";
//	}
	
	

@PostMapping("/save")
public String save(
        @Valid @ModelAttribute("product") Products product,
        BindingResult result,
        RedirectAttributes redirect) {

    if (result.hasErrors()) {
        if (product.getId() != null) {
            return "update-form";
        }
        return "product-form";
    }

    if (product.getId() == null) {
        productservice.save(product);
        redirect.addFlashAttribute("msg", "Product Saved Successfully");
    } else {
        productservice.save(product);
        redirect.addFlashAttribute("msg", "Product Updated Successfully");
    }

    return "redirect:/products";
}


	
	@GetMapping("/update")
	public String update(@RequestParam int id,Model model)
	{
		Products product=productservice.getById(id);
		model.addAttribute("product", product);
		return "update-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id,RedirectAttributes redirect)
	{
		productservice.delete(id);
		redirect.addFlashAttribute("msg","Product Deleted Successfully");
		return "redirect:/products";
	}
	
}
