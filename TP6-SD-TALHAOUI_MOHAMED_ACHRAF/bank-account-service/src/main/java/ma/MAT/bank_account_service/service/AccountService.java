package ma.MAT.bank_account_service.service;

import ma.MAT.bank_account_service.dto.BankAccountResponseDTO;
import ma.MAT.bank_account_service.dto.BankAccountRequestDTO;

public interface AccountService {

     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}

