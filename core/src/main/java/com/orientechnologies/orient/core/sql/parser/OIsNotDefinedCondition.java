/* Generated By:JJTree: Do not edit this line. OIsNotDefinedCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OIsNotDefinedCondition extends SimpleNode {
  public OIsNotDefinedCondition(int id) {
    super(id);
  }

  public OIsNotDefinedCondition(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1c766d6caf5ccae19c1c291396bb56f2 (do not edit this line) */
