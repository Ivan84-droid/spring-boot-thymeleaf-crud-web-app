package net.javaguides.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "academic_degree")
    private String academicDegree;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "postgraduate_degree")
    private String postgraduateDegree;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private String age;
    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "recruitment")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date recruitment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")

    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getPostgraduateDegree() {
        return postgraduateDegree;
    }

    public void setPostgraduateDegree(String postgraduateDegree) {
        this.postgraduateDegree = postgraduateDegree;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public Date getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Date recruitment) {
        this.recruitment = recruitment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
}


