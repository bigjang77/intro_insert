package site.metacoding.testproject.domain.company;

import java.util.List;

public interface CompanyDao {
	public List<Company> findAll();

	public Company findById(Integer companyId);

	public void insert(Company company);

	public void update(Integer companyId, Company company);

	public void deleteById(Integer companyId);
}
