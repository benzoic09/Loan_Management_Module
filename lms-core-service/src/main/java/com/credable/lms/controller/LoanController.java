package com.credable.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {
    @PostMapping
    public ResponseEntity<LoanResponse> requestLoan(
        @RequestBody LoanRequest request) {
            //
        }

        @GetMapping("/{loanId}")
        public ResponseEntity<LoanStatusResponse> getLoanStatus(
                @PathVariable String loanId) {
                    //
                }
    
}
