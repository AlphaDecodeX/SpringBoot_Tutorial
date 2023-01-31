package Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customer")
    public Customer all(){
        return  new Customer("Lovepreet", "lpsk@gmail.com");
    }
}
