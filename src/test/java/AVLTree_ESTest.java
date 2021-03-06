/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 03:27:55 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(0);
      aVLTree0.height();
      aVLTree0.delete((-13));
      aVLTree0.delete(0);
      aVLTree0.insert((-1082));
      aVLTree0.insert((-13));
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1449);
      aVLTree0.insert(1712);
      aVLTree0.insert((-133));
      aVLTree0.delete((-1329));
      aVLTree0.insert((-2618));
      aVLTree0.delete(0);
      aVLTree0.insert((-1329));
      aVLTree0.height();
      aVLTree0.delete((-1176));
      int int0 = 0;
      aVLTree0.delete(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-2618));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-392));
      aVLTree0.delete((-1));
      aVLTree0.delete((-1));
      aVLTree0.delete((-1));
      aVLTree0.delete(1014);
      aVLTree0.delete(0);
      aVLTree0.insert(1);
      aVLTree0.insert(1188);
      aVLTree0.delete(1188);
      aVLTree0.insert(0);
      aVLTree0.insert(1188);
      aVLTree0.insert(1441);
      aVLTree0.insert(1796);
      aVLTree0.delete(1441);
      aVLTree0.delete(0);
      aVLTree0.delete(1084);
      aVLTree0.insert(4273);
      aVLTree0.insert(1084);
      aVLTree0.find(4273);
      aVLTree0.height();
      aVLTree0.find(1);
      aVLTree0.find(0);
      aVLTree0.find(1);
      aVLTree0.find(1796);
      aVLTree0.find(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(622);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3717);
      aVLTree0.find(3717);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(437);
      aVLTree0.find((-2267));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-201));
      aVLTree0.delete((-201));
      aVLTree0.insert((-1));
      aVLTree0.delete((-1));
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-992);
      aVLTree0.insert((-992));
      int int1 = 2526;
      aVLTree0.insert(2526);
      // Undeclared exception!
      try { 
        aVLTree0.insert(2526);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2262));
      aVLTree0.getRoot();
      aVLTree0.find(3405);
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.left.right = aVLTree_Node0.left;
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(294);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.height();
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node0.left.height = 294;
      // Undeclared exception!
      try { 
        aVLTree0.delete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-3213));
      aVLTree0.delete((-3213));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find((-3213));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree_Node0.key = 0;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert(2439);
      aVLTree0.height();
      aVLTree0.delete(1);
      aVLTree0.delete(1);
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.find(0);
      aVLTree0.delete(1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2646));
      aVLTree0.insert(75);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.getRoot();
      aVLTree0.height();
      aVLTree0.delete(2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2882);
      aVLTree0.delete((-1171));
      aVLTree0.insert(0);
      int int0 = 222;
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(222);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 0;
      aVLTree_Node2.left = aVLTree_Node0.left;
      aVLTree_Node0.left.right = aVLTree_Node2.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getRoot();
      int int1 = (-932);
      // Undeclared exception!
      aVLTree0.find((-932));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.delete((-1311));
      aVLTree0.insert((-1311));
      aVLTree0.insert(1);
      aVLTree0.delete((-1311));
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1486);
      aVLTree0.insert((-3108));
      aVLTree0.delete((-1311));
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1320));
      aVLTree0.delete((-1320));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-1320));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(93);
      aVLTree0.insert(2508);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.delete(2508);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.delete((-3802));
      aVLTree_Node1.key = (-3802);
      aVLTree0.insert(224);
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node1.key = 6;
      aVLTree_Node0.right = aVLTree_Node1;
      int int1 = aVLTree0.height();
      aVLTree0.delete((-518));
      aVLTree_Node1.height = 6;
      int int2 = (-323);
      aVLTree0.delete(int2);
      aVLTree0.delete(int1);
      int int3 = 0;
      aVLTree0.delete(int3);
      aVLTree0.find(int2);
      aVLTree0.find(int0);
      int int4 = 5805;
      aVLTree0.delete(int4);
      int int5 = 1;
      aVLTree0.insert(int5);
      aVLTree0.insert(int2);
      aVLTree0.delete(int5);
      int int6 = 1407;
      aVLTree0.insert(int6);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.delete(1985);
      aVLTree0.delete((-102));
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.delete((-1));
      aVLTree0.insert(1);
      aVLTree0.delete((-3437));
      aVLTree0.getRoot();
      aVLTree0.delete(1985);
      aVLTree0.insert((-1));
      aVLTree0.delete(0);
      aVLTree0.find(0);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2882);
      aVLTree0.delete((-1171));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(222);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 0;
      aVLTree_Node2.left = aVLTree_Node0.left;
      aVLTree_Node0.left.right = aVLTree_Node2.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree_Node3.left = aVLTree_Node0.left;
      aVLTree0.getBalance(aVLTree_Node3);
      aVLTree0.getBalance(aVLTree_Node0.left.right);
      aVLTree_Node0.left.left = aVLTree_Node3.left;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.left.left = null;
      aVLTree0.getBalance(aVLTree_Node3);
      aVLTree0.insert(1);
      aVLTree0.delete(222);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2882);
      int int0 = 0;
      aVLTree0.delete((-1171));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(222);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.left.key = 222;
      aVLTree_Node0.key = 0;
      aVLTree_Node2.left = aVLTree_Node0.left;
      aVLTree_Node0.left.right = aVLTree_Node2.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      AVLTree.Node aVLTree_Node3 = aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree_Node3.left = aVLTree_Node0.left;
      aVLTree0.getBalance(aVLTree_Node3);
      aVLTree0.getBalance(aVLTree_Node0.left.right);
      aVLTree_Node0.left.left = aVLTree_Node3.left;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.left.left = null;
      aVLTree0.getBalance(aVLTree_Node3);
      aVLTree0.insert(1);
      aVLTree0.delete(222);
      aVLTree0.height();
      aVLTree0.getRoot();
      int int1 = 0;
      aVLTree0.delete(int1);
      aVLTree0.getRoot();
      aVLTree0.find(int0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2882);
      int int0 = 0;
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      int int1 = 222;
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(222);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree_Node1.left = aVLTree_Node0.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 0;
      aVLTree_Node2.left = aVLTree_Node0.left;
      aVLTree_Node0.left.right = aVLTree_Node0.left;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.right = aVLTree_Node0;
      AVLTree.Node aVLTree_Node3 = aVLTree0.find(2882);
      aVLTree0.find(0);
      aVLTree_Node3.left = aVLTree_Node0.left;
      aVLTree0.getBalance(aVLTree_Node3);
      aVLTree_Node0.height = (-465);
      aVLTree0.getBalance(aVLTree_Node0.left.right);
      aVLTree_Node0.left.left = aVLTree_Node3.left;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.left.left = null;
      aVLTree0.getBalance(aVLTree_Node3);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-464));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }
}
