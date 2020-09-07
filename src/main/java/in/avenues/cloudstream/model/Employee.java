package in.avenues.cloudstream.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    private String empName;
    private String empId;

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empId=" + empId +"]";
    }
}
