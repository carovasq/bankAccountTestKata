import org.example.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class bankAccountTest {
    @Test //Reconocer que es un Test
    @DisplayName("Test si el numberAccount es único") //Descripcion del Test
    void testCreateBankAccountWithInitialBalanceAndTitular(){
        //Given (Dado): Escenario -> Arrange
        String titular = "Carito";
        double initialBalance = 0;

        //When (Cuando): Acciones -> Act
        BankAccount bankAccount = new BankAccount(titular, initialBalance);

        //Then (Después): Comprobar -> Assert
        assertEquals(titular, bankAccount.getTitular(), "The account holder name should be correct");
        assertEquals(initialBalance, bankAccount.getBalance(), "The initial balance should be set correctly");
        System.out.println("bankAccountTest is OK!");
    }
}
