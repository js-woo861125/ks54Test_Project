package ks54team01.admin.contract.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminEnterpriseContract {
	private String entContractNo;
	private String entCeoNo;
	private Double feeRateSales;
	private Double teeRateRental;
	private Double feeRetePenalty;
	private Integer entryFee;
	private LocalDate  contractDate;
	private LocalDate contractEndDate;
	private String entCalDate;
	private String contractStatus;
}
