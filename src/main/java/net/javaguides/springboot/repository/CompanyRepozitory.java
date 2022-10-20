package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Company;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepozitory extends JpaRepository<Company, Long> {
}
