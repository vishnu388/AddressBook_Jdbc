import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddressBookTest {
    AddressBook addressBook;
    List<AddressBookData> addressBookDataList;

    @Test
    public void givenThreeContactsInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        addressBook = new AddressBook();
        Assert.assertEquals(0,  addressBook.readAddressBookData(AddressBook.IOService.DB_IO).size());
    }
}
