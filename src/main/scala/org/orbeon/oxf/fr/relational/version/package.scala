package org.orbeon.oxf.fr.relational

package object version {

    sealed trait  Version
    case   object Latest                          extends Version
    case   object Next                            extends Version
    case   class  Specific   (version: Int)       extends Version
    case   class  ForDocument(documentId: String) extends Version

}
