/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package paramform.model;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import paramform.model.queries.ParameterChoicesViewImpl;
import paramform.model.queries.ParameterDefinitionViewImpl;
import paramform.model.queries.ParameterFormDefinitionViewImpl;
import paramform.model.queries.ParameterFormItemSetViewImpl;
import paramform.model.queries.ParameterFormItemsImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ParameterFormModuleImpl extends ApplicationModuleImpl {
  /**This is the default constructor (do not remove)
   */
  public ParameterFormModuleImpl() {
  }

  /**Container's getter for ParameterChoicesView1
   */
  public ParameterChoicesViewImpl getParameterChoicesView1() {
    return (ParameterChoicesViewImpl)findViewObject("ParameterChoicesView1");
  }

  /**Container's getter for ParameterDefinitionView1
   */
  public ParameterDefinitionViewImpl getParameterDefinitionView1() {
    return (ParameterDefinitionViewImpl)findViewObject("ParameterDefinitionView1");
  }

  /**Container's getter for ParameterChoicesView2
   */
  public ParameterChoicesViewImpl getParameterChoicesView2() {
    return (ParameterChoicesViewImpl)findViewObject("ParameterChoicesView2");
  }

  /**Container's getter for ParameterFormItemSetView2
   */
  public ParameterFormItemSetViewImpl getParameterFormItemSetView2() {
    return (ParameterFormItemSetViewImpl)findViewObject("ParameterFormItemSetView2");
  }

  /**Container's getter for ParameterFormItemSetView3
   */
  public ParameterFormItemSetViewImpl getParameterFormItemSetView3() {
    return (ParameterFormItemSetViewImpl)findViewObject("ParameterFormItemSetView3");
  }

  /**Container's getter for ParameterChoicesFkLink1
   */
  public ViewLinkImpl getParameterChoicesFkLink1() {
    return (ViewLinkImpl)findViewLink("ParameterChoicesFkLink1");
  }

  /**Container's getter for ParameterFormItemSetFkLink1
   */
  public ViewLinkImpl getParameterFormItemSetFkLink1() {
    return (ViewLinkImpl)findViewLink("ParameterFormItemSetFkLink1");
  }

  /**Container's getter for ParameterFormItemSetFk1Link1
   */
  public ViewLinkImpl getParameterFormItemSetFk1Link1() {
    return (ViewLinkImpl)findViewLink("ParameterFormItemSetFk1Link1");
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("paramform.model", /* package name */
      "ParameterFormModuleLocal" /* Configuration Name */);
  }

  /**Container's getter for ParameterChoices
   */
  public ParameterChoicesViewImpl getParameterChoices() {
    return (ParameterChoicesViewImpl)findViewObject("ParameterChoices");
  }

  /**Container's getter for ParameterFormItems
   */
  public ParameterFormItemsImpl getParameterFormItems() {
    return (ParameterFormItemsImpl)findViewObject("ParameterFormItems");
  }

  /**Container's getter for ParameterDefinitions
   */
  public ParameterDefinitionViewImpl getParameterDefinitions() {
    return (ParameterDefinitionViewImpl)findViewObject("ParameterDefinitions");
  }

  /**Container's getter for ChoicesForParameterDefinition1
   */
  public ViewLinkImpl getChoicesForParameterDefinition1() {
    return (ViewLinkImpl)findViewLink("ChoicesForParameterDefinition1");
  }

  /**Container's getter for ParameterFormDefinitions
   */
  public ParameterFormDefinitionViewImpl getParameterFormDefinitions() {
    return (ParameterFormDefinitionViewImpl)findViewObject("ParameterFormDefinitions");
  }

  /**Container's getter for ItemsIncludedInForm
   */
  public ParameterFormItemSetViewImpl getItemsIncludedInForm() {
    return (ParameterFormItemSetViewImpl)findViewObject("ItemsIncludedInForm");
  }

  /**Container's getter for ItemsIncludeInForm1
   */
  public ViewLinkImpl getItemsIncludeInForm1() {
    return (ViewLinkImpl)findViewLink("ItemsIncludeInForm1");
  }
}