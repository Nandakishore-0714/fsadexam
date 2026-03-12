package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.repository.InvoiceRepository;

@Service
public class InvoiceService 
{
    @Autowired
    InvoiceRepository repo;

    // Add invoice
    public Invoice addInvoice(Invoice invoice)
    {
        return repo.save(invoice);
    }

    // Get all invoices
    public List<Invoice> getInvoices()
    {
        return repo.findAll();
    }
}