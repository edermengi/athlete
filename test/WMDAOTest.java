import dao.WMDAO;

/**
 * Created by yevhenii on 8/15/15.
 */
public class WMDAOTest {

    @org.junit.Test
    public void testGetFoodCatalog() throws Exception {
        WMDAO wmDao = new WMDAO();
        wmDao.getDocs();
    }
}
