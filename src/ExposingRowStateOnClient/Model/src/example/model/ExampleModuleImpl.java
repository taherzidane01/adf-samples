/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package example.model;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class ExampleModuleImpl extends ApplicationModuleImpl  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public ExampleModuleImpl() {
  }

  /**
   * 
   *  Container's getter for DeptView1
   */
  public DeptViewImpl getDeptView1() {
    return (DeptViewImpl)findViewObject("DeptView1");
  }

  /**
   * 
   *  Container's getter for EmpView1
   */
  public EmpViewImpl getEmpView1() {
    return (EmpViewImpl)findViewObject("EmpView1");
  }

  /**
   * 
   *  Container's getter for EmpView2
   */
  public EmpViewImpl getEmpView2() {
    return (EmpViewImpl)findViewObject("EmpView2");
  }

  /**
   * 
   *  Container's getter for WorksInDeptLink1
   */
  public ViewLinkImpl getWorksInDeptLink1() {
    return (ViewLinkImpl)findViewLink("WorksInDeptLink1");
  }

  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("example.model", "ExampleModuleLocal");
  }
}
