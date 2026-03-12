package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController 
{
    @Autowired
    InvoiceService service;


    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice)
    {
        return service.addInvoice(invoice);
    }

    @GetMapping("/view")
    public List<Invoice> viewInvoices()
    {
        return service.getInvoices();
    }
}
