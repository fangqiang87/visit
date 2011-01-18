// ***************************************************************************
//
// Copyright (c) 2000 - 2011, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-442911
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit;

import java.util.Vector;
import java.lang.Double;
import java.lang.Integer;

// ****************************************************************************
// Class: avtScalarMetaData
//
// Purpose:
//    Contains scalar metadata attributes
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class avtScalarMetaData extends avtVarMetaData
{
    private static int avtScalarMetaData_numAdditionalAtts = 10;

    // Enum values
    public final static int PARTIALCELLMODES_INCLUDE = 0;
    public final static int PARTIALCELLMODES_EXCLUDE = 1;
    public final static int PARTIALCELLMODES_DISSECT = 2;

    public final static int ENUMTYPES_NONE = 0;
    public final static int ENUMTYPES_BYVALUE = 1;
    public final static int ENUMTYPES_BYRANGE = 2;
    public final static int ENUMTYPES_BYBITMASK = 3;
    public final static int ENUMTYPES_BYNCHOOSER = 4;


    public avtScalarMetaData()
    {
        super(avtScalarMetaData_numAdditionalAtts);

        treatAsASCII = false;
        enumerationType = ENUMTYPES_NONE;
        enumNames = new Vector();
        enumRanges = new Vector();
        enumAlwaysExclude = new double[2];
        enumAlwaysExclude[0] = 0;
        enumAlwaysExclude[1] = 0;
        enumAlwaysInclude = new double[2];
        enumAlwaysInclude[0] = 0;
        enumAlwaysInclude[1] = 0;
        enumPartialCellMode = PARTIALCELLMODES_EXCLUDE;
        enumGraphEdges = new Vector();
        enumNChooseRN = 0;
        enumNChooseRMaxR = 0;
    }

    public avtScalarMetaData(int nMoreFields)
    {
        super(avtScalarMetaData_numAdditionalAtts + nMoreFields);

        treatAsASCII = false;
        enumerationType = ENUMTYPES_NONE;
        enumNames = new Vector();
        enumRanges = new Vector();
        enumAlwaysExclude = new double[2];
        enumAlwaysExclude[0] = 0;
        enumAlwaysExclude[1] = 0;
        enumAlwaysInclude = new double[2];
        enumAlwaysInclude[0] = 0;
        enumAlwaysInclude[1] = 0;
        enumPartialCellMode = PARTIALCELLMODES_EXCLUDE;
        enumGraphEdges = new Vector();
        enumNChooseRN = 0;
        enumNChooseRMaxR = 0;
    }

    public avtScalarMetaData(avtScalarMetaData obj)
    {
        super(avtScalarMetaData_numAdditionalAtts);

        int i;

        treatAsASCII = obj.treatAsASCII;
        enumerationType = obj.enumerationType;
        enumNames = new Vector(obj.enumNames.size());
        for(i = 0; i < obj.enumNames.size(); ++i)
            enumNames.addElement(new String((String)obj.enumNames.elementAt(i)));

        enumRanges = new Vector(obj.enumRanges.size());
        for(i = 0; i < obj.enumRanges.size(); ++i)
        {
            Double dv = (Double)obj.enumRanges.elementAt(i);
            enumRanges.addElement(new Double(dv.doubleValue()));
        }

        enumAlwaysExclude = new double[2];
        enumAlwaysExclude[0] = obj.enumAlwaysExclude[0];
        enumAlwaysExclude[1] = obj.enumAlwaysExclude[1];

        enumAlwaysInclude = new double[2];
        enumAlwaysInclude[0] = obj.enumAlwaysInclude[0];
        enumAlwaysInclude[1] = obj.enumAlwaysInclude[1];

        enumPartialCellMode = obj.enumPartialCellMode;
        enumGraphEdges = new Vector();
        for(i = 0; i < obj.enumGraphEdges.size(); ++i)
        {
            Integer iv = (Integer)obj.enumGraphEdges.elementAt(i);
            enumGraphEdges.addElement(new Integer(iv.intValue()));
        }
        enumNChooseRN = obj.enumNChooseRN;
        enumNChooseRMaxR = obj.enumNChooseRMaxR;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return avtScalarMetaData_numAdditionalAtts;
    }

    public boolean equals(avtScalarMetaData obj)
    {
        int i;

        // Compare the elements in the enumNames vector.
        boolean enumNames_equal = (obj.enumNames.size() == enumNames.size());
        for(i = 0; (i < enumNames.size()) && enumNames_equal; ++i)
        {
            // Make references to String from Object.
            String enumNames1 = (String)enumNames.elementAt(i);
            String enumNames2 = (String)obj.enumNames.elementAt(i);
            enumNames_equal = enumNames1.equals(enumNames2);
        }
        // Compare the elements in the enumRanges vector.
        boolean enumRanges_equal = (obj.enumRanges.size() == enumRanges.size());
        for(i = 0; (i < enumRanges.size()) && enumRanges_equal; ++i)
        {
            // Make references to Double from Object.
            Double enumRanges1 = (Double)enumRanges.elementAt(i);
            Double enumRanges2 = (Double)obj.enumRanges.elementAt(i);
            enumRanges_equal = enumRanges1.equals(enumRanges2);
        }
        // Compare the enumAlwaysExclude arrays.
        boolean enumAlwaysExclude_equal = true;
        for(i = 0; i < 2 && enumAlwaysExclude_equal; ++i)
            enumAlwaysExclude_equal = (enumAlwaysExclude[i] == obj.enumAlwaysExclude[i]);

        // Compare the enumAlwaysInclude arrays.
        boolean enumAlwaysInclude_equal = true;
        for(i = 0; i < 2 && enumAlwaysInclude_equal; ++i)
            enumAlwaysInclude_equal = (enumAlwaysInclude[i] == obj.enumAlwaysInclude[i]);

        // Compare the elements in the enumGraphEdges vector.
        boolean enumGraphEdges_equal = (obj.enumGraphEdges.size() == enumGraphEdges.size());
        for(i = 0; (i < enumGraphEdges.size()) && enumGraphEdges_equal; ++i)
        {
            // Make references to Integer from Object.
            Integer enumGraphEdges1 = (Integer)enumGraphEdges.elementAt(i);
            Integer enumGraphEdges2 = (Integer)obj.enumGraphEdges.elementAt(i);
            enumGraphEdges_equal = enumGraphEdges1.equals(enumGraphEdges2);
        }
        // Create the return value
        return (super.equals(obj) && (treatAsASCII == obj.treatAsASCII) &&
                (enumerationType == obj.enumerationType) &&
                enumNames_equal &&
                enumRanges_equal &&
                enumAlwaysExclude_equal &&
                enumAlwaysInclude_equal &&
                (enumPartialCellMode == obj.enumPartialCellMode) &&
                enumGraphEdges_equal &&
                (enumNChooseRN == obj.enumNChooseRN) &&
                (enumNChooseRMaxR == obj.enumNChooseRMaxR));
    }

    // Property setting methods
    public void SetTreatAsASCII(boolean treatAsASCII_)
    {
        treatAsASCII = treatAsASCII_;
        Select((new avtScalarMetaData()).Offset() + 0);
    }

    public void SetEnumerationType(int enumerationType_)
    {
        enumerationType = enumerationType_;
        Select((new avtScalarMetaData()).Offset() + 1);
    }

    public void SetEnumNames(Vector enumNames_)
    {
        enumNames = enumNames_;
        Select((new avtScalarMetaData()).Offset() + 2);
    }

    public void SetEnumRanges(Vector enumRanges_)
    {
        enumRanges = enumRanges_;
        Select((new avtScalarMetaData()).Offset() + 3);
    }

    public void SetEnumAlwaysExclude(double[] enumAlwaysExclude_)
    {
        enumAlwaysExclude[0] = enumAlwaysExclude_[0];
        enumAlwaysExclude[1] = enumAlwaysExclude_[1];
        Select((new avtScalarMetaData()).Offset() + 4);
    }

    public void SetEnumAlwaysExclude(double e0, double e1)
    {
        enumAlwaysExclude[0] = e0;
        enumAlwaysExclude[1] = e1;
        Select((new avtScalarMetaData()).Offset() + 4);
    }

    public void SetEnumAlwaysInclude(double[] enumAlwaysInclude_)
    {
        enumAlwaysInclude[0] = enumAlwaysInclude_[0];
        enumAlwaysInclude[1] = enumAlwaysInclude_[1];
        Select((new avtScalarMetaData()).Offset() + 5);
    }

    public void SetEnumAlwaysInclude(double e0, double e1)
    {
        enumAlwaysInclude[0] = e0;
        enumAlwaysInclude[1] = e1;
        Select((new avtScalarMetaData()).Offset() + 5);
    }

    public void SetEnumPartialCellMode(int enumPartialCellMode_)
    {
        enumPartialCellMode = enumPartialCellMode_;
        Select((new avtScalarMetaData()).Offset() + 6);
    }

    public void SetEnumGraphEdges(Vector enumGraphEdges_)
    {
        enumGraphEdges = enumGraphEdges_;
        Select((new avtScalarMetaData()).Offset() + 7);
    }

    public void SetEnumNChooseRN(int enumNChooseRN_)
    {
        enumNChooseRN = enumNChooseRN_;
        Select((new avtScalarMetaData()).Offset() + 8);
    }

    public void SetEnumNChooseRMaxR(int enumNChooseRMaxR_)
    {
        enumNChooseRMaxR = enumNChooseRMaxR_;
        Select((new avtScalarMetaData()).Offset() + 9);
    }

    // Property getting methods
    public boolean  GetTreatAsASCII() { return treatAsASCII; }
    public int      GetEnumerationType() { return enumerationType; }
    public Vector   GetEnumNames() { return enumNames; }
    public Vector   GetEnumRanges() { return enumRanges; }
    public double[] GetEnumAlwaysExclude() { return enumAlwaysExclude; }
    public double[] GetEnumAlwaysInclude() { return enumAlwaysInclude; }
    public int      GetEnumPartialCellMode() { return enumPartialCellMode; }
    public Vector   GetEnumGraphEdges() { return enumGraphEdges; }
    public int      GetEnumNChooseRN() { return enumNChooseRN; }
    public int      GetEnumNChooseRMaxR() { return enumNChooseRMaxR; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        super.WriteAtts(buf);

        int offset = (new avtScalarMetaData()).Offset();
        if(WriteSelect(offset + 0, buf))
            buf.WriteBool(treatAsASCII);
        if(WriteSelect(offset + 1, buf))
            buf.WriteInt(enumerationType);
        if(WriteSelect(offset + 2, buf))
            buf.WriteStringVector(enumNames);
        if(WriteSelect(offset + 3, buf))
            buf.WriteDoubleVector(enumRanges);
        if(WriteSelect(offset + 4, buf))
            buf.WriteDoubleArray(enumAlwaysExclude);
        if(WriteSelect(offset + 5, buf))
            buf.WriteDoubleArray(enumAlwaysInclude);
        if(WriteSelect(offset + 6, buf))
            buf.WriteInt(enumPartialCellMode);
        if(WriteSelect(offset + 7, buf))
            buf.WriteIntVector(enumGraphEdges);
        if(WriteSelect(offset + 8, buf))
            buf.WriteInt(enumNChooseRN);
        if(WriteSelect(offset + 9, buf))
            buf.WriteInt(enumNChooseRMaxR);
    }

    public void ReadAtts(int id, CommunicationBuffer buf)
    {
        int offset = (new avtScalarMetaData()).Offset();
        int index = id - offset;
        switch(index)
        {
        case 0:
            SetTreatAsASCII(buf.ReadBool());
            break;
        case 1:
            SetEnumerationType(buf.ReadInt());
            break;
        case 2:
            SetEnumNames(buf.ReadStringVector());
            break;
        case 3:
            SetEnumRanges(buf.ReadDoubleVector());
            break;
        case 4:
            SetEnumAlwaysExclude(buf.ReadDoubleArray());
            break;
        case 5:
            SetEnumAlwaysInclude(buf.ReadDoubleArray());
            break;
        case 6:
            SetEnumPartialCellMode(buf.ReadInt());
            break;
        case 7:
            SetEnumGraphEdges(buf.ReadIntVector());
            break;
        case 8:
            SetEnumNChooseRN(buf.ReadInt());
            break;
        case 9:
            SetEnumNChooseRMaxR(buf.ReadInt());
            break;
        default:
            super.ReadAtts(id, buf);
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + boolToString("treatAsASCII", treatAsASCII, indent) + "\n";
        str = str + indent + "enumerationType = ";
        if(enumerationType == ENUMTYPES_NONE)
            str = str + "ENUMTYPES_NONE";
        if(enumerationType == ENUMTYPES_BYVALUE)
            str = str + "ENUMTYPES_BYVALUE";
        if(enumerationType == ENUMTYPES_BYRANGE)
            str = str + "ENUMTYPES_BYRANGE";
        if(enumerationType == ENUMTYPES_BYBITMASK)
            str = str + "ENUMTYPES_BYBITMASK";
        if(enumerationType == ENUMTYPES_BYNCHOOSER)
            str = str + "ENUMTYPES_BYNCHOOSER";
        str = str + "\n";
        str = str + stringVectorToString("enumNames", enumNames, indent) + "\n";
        str = str + doubleVectorToString("enumRanges", enumRanges, indent) + "\n";
        str = str + doubleArrayToString("enumAlwaysExclude", enumAlwaysExclude, indent) + "\n";
        str = str + doubleArrayToString("enumAlwaysInclude", enumAlwaysInclude, indent) + "\n";
        str = str + indent + "enumPartialCellMode = ";
        if(enumPartialCellMode == PARTIALCELLMODES_INCLUDE)
            str = str + "PARTIALCELLMODES_INCLUDE";
        if(enumPartialCellMode == PARTIALCELLMODES_EXCLUDE)
            str = str + "PARTIALCELLMODES_EXCLUDE";
        if(enumPartialCellMode == PARTIALCELLMODES_DISSECT)
            str = str + "PARTIALCELLMODES_DISSECT";
        str = str + "\n";
        str = str + intVectorToString("enumGraphEdges", enumGraphEdges, indent) + "\n";
        str = str + intToString("enumNChooseRN", enumNChooseRN, indent) + "\n";
        str = str + intToString("enumNChooseRMaxR", enumNChooseRMaxR, indent) + "\n";
        return super.toString(indent) + str;
    }


    // Attributes
    private boolean  treatAsASCII;
    private int      enumerationType;
    private Vector   enumNames; // vector of String objects
    private Vector   enumRanges; // vector of Double objects
    private double[] enumAlwaysExclude;
    private double[] enumAlwaysInclude;
    private int      enumPartialCellMode;
    private Vector   enumGraphEdges; // vector of Integer objects
    private int      enumNChooseRN;
    private int      enumNChooseRMaxR;
}

