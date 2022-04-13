import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAVLTree {

    public static boolean debug = false;
    
    @Test
    public void testBalance() throws Throwable {        
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(2);
        aVLTree0.insert(1);
        aVLTree0.insert(5);
        aVLTree0.insert(7);
        aVLTree0.insert(10);
        org.junit.Assert.assertNotNull(aVLTree0.getRoot());
    }
    
    @Test
    public void testBalance2() throws Throwable {        
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(7);
        aVLTree0.insert(1);
        aVLTree0.insert(5);
        aVLTree0.insert(6);
        aVLTree0.insert(10);
        org.junit.Assert.assertNotNull(aVLTree0.getRoot());
    }
    
    @Test
    public void find() throws Throwable {        
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(7);
        org.junit.Assert.assertNotNull(aVLTree0.find(7));
    }
    
    @Test
    public void findNotFound() throws Throwable {        
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(7);
        org.junit.Assert.assertNull(aVLTree0.find(15));
    }
    
    @Test
    public void delete() throws Throwable {        
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert(7);
        aVLTree0.insert(5);
        aVLTree0.insert(9);
        aVLTree0.delete(7);
        org.junit.Assert.assertNull(aVLTree0.find(7));
    }

  
}

