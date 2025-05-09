package ks54team01.admin.contract.service;

import java.util.List;

import ks54team01.admin.contract.domain.AdminContract;
import ks54team01.admin.contract.domain.AdminEnterpriseContract;

public interface AdminContractService {

	List<AdminContract> getSearchContractList(String searchKey, String searchValue);
	
	List<AdminContract> getContractList();
	
	List<AdminEnterpriseContract> getAdminEnterpriseContractList();
}
