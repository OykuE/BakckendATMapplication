package atmapplication.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawDto {
    private int userId;
    private String accountType;
    private double withdraw;
}
