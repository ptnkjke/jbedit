/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
/* Generated By:JJTree&JavaCC: Do not edit this line. MiniParserTokenManager.java */
package Mini;

public class MiniParserTokenManager implements MiniParserConstants
{
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
//static private void jjCheckNAddStates(int start, int end)
//{
//   do {
//      jjCheckNAdd(jjnextStates[start]);
//   } while (start++ != end);
//}
//static private void jjCheckNAddStates(int start)
//{
//   jjCheckNAdd(jjnextStates[start]);
//   jjCheckNAdd(jjnextStates[start + 1]);
//}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff) {
        ReInitRounds();
    }
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 7) {
                        kind = 7;
                    }
                  }
                  if (curChar == 13) {
                    jjstateSet[jjnewStateCnt++] = 1;
                }
                  break;
               case 1:
                  if (curChar == 10 && kind > 7) {
                    kind = 7;
                }
                  break;
               case 2:
                  if (curChar == 13) {
                    jjstateSet[jjnewStateCnt++] = 1;
                }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
        return curPos;
    }
      try { curChar = ASCII_CharStream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private static int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x300780fe00L) != 0L)
         {
            jjmatchedKind = 40;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x400a400L) != 0L) {
            return 1;
        }
         if ((active0 & 0x3003805a00L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x2004200L) != 0L) {
            return 1;
        }
         if ((active0 & 0x3001801800L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x2000800000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x1001001800L) != 0L) {
            return 1;
        }
         return -1;
      default :
         return -1;
   }
}
private static int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = ASCII_CharStream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 37:
         return jjStopAtPos(0, 30);
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 33);
      case 42:
         return jjStopAtPos(0, 29);
      case 43:
         return jjStopAtPos(0, 27);
      case 44:
         return jjStopAtPos(0, 35);
      case 45:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 47:
         return jjStopAtPos(0, 31);
      case 60:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 61:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 62:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x802200L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x8400L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x1000800L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = ASCII_CharStream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x40L) != 0L) {
            return jjStopAtPos(1, 6);
        }
         break;
      case 61:
         if ((active0 & 0x40000L) != 0L) {
            return jjStopAtPos(1, 18);
        } else if ((active0 & 0x80000L) != 0L) {
            return jjStopAtPos(1, 19);
        } else if ((active0 & 0x100000L) != 0L) {
            return jjStopAtPos(1, 20);
        } else if ((active0 & 0x200000L) != 0L) {
            return jjStopAtPos(1, 21);
        }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000004000L);
      case 70:
         if ((active0 & 0x400L) != 0L) {
            return jjStartNfaWithStates_0(1, 10, 1);
        }
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 73:
         if ((active0 & 0x2000L) != 0L) {
            return jjStartNfaWithStates_0(1, 13, 1);
        }
         break;
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 78:
         if ((active0 & 0x8000L) != 0L) {
            return jjStartNfaWithStates_0(1, 15, 1);
        }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 82:
         if ((active0 & 0x4000000L) != 0L) {
            return jjStartNfaWithStates_0(1, 26, 1);
        }
         return jjMoveStringLiteralDfa2_0(active0, 0x2001000000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L) {
    return jjStartNfa_0(0, old0);
} 
   try { curChar = ASCII_CharStream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 68:
         if ((active0 & 0x2000000L) != 0L) {
            return jjStartNfaWithStates_0(2, 25, 1);
        }
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 78:
         if ((active0 & 0x200L) != 0L) {
            return jjStartNfaWithStates_0(2, 9, 1);
        }
         break;
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 84:
         if ((active0 & 0x4000L) != 0L) {
            return jjStartNfaWithStates_0(2, 14, 1);
        }
         break;
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L) {
    return jjStartNfa_0(1, old0);
} 
   try { curChar = ASCII_CharStream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x1000000000L) != 0L) {
            return jjStartNfaWithStates_0(3, 36, 1);
        }
         break;
      case 69:
         if ((active0 & 0x1000L) != 0L) {
            return jjStartNfaWithStates_0(3, 12, 1);
        } else if ((active0 & 0x1000000L) != 0L) {
            return jjStartNfaWithStates_0(3, 24, 1);
        }
         break;
      case 78:
         if ((active0 & 0x800L) != 0L) {
            return jjStartNfaWithStates_0(3, 11, 1);
        }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L) {
    return jjStartNfa_0(2, old0);
} 
   try { curChar = ASCII_CharStream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x800000L) != 0L) {
            return jjStartNfaWithStates_0(4, 23, 1);
        } else if ((active0 & 0x2000000000L) != 0L) {
            return jjStartNfaWithStates_0(4, 37, 1);
        }
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff) {
        ReInitRounds();
    }
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 41) {
                        kind = 41;
                    }
                     jjCheckNAdd(2);
                  }
                  else if (curChar == 34) {
                    jjCheckNAddTwoStates(4, 5);
                }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L) {
                    break;
                }
                  if (kind > 40) {
                    kind = 40;
                }
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L) {
                    break;
                }
                  if (kind > 41) {
                    kind = 41;
                }
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if (curChar == 34) {
                    jjCheckNAddTwoStates(4, 5);
                }
                  break;
               case 4:
                  if ((0xfffffffbffffdbffL & l) != 0L) {
                    jjCheckNAddTwoStates(4, 5);
                }
                  break;
               case 5:
                  if (curChar == 34 && kind > 42) {
                    kind = 42;
                }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L) {
                    break;
                }
                  if (kind > 40) {
                    kind = 40;
                }
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L) {
                    break;
                }
                  if (kind > 40) {
                    kind = 40;
                }
                  jjCheckNAdd(1);
                  break;
               case 4:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L) {
                    jjAddStates(0, 1);
                }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt))) {
        return curPos;
    }
      try { curChar = ASCII_CharStream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   4, 5, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\106\125\116", 
"\111\106", "\124\110\105\116", "\105\114\123\105", "\106\111", "\114\105\124", 
"\111\116", "\76", "\74", "\76\75", "\74\75", "\75\75", "\41\75", "\41", 
"\106\101\114\123\105", "\124\122\125\105", "\101\116\104", "\117\122", "\53", "\55", "\52", "\45", 
"\57", "\50", "\51", "\75", "\54", "\122\105\101\104", "\127\122\111\124\105", null, 
null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "SINGLE_LINE_COMMENT_STATE", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x73ffffffe01L, 
};
static final long[] jjtoSkip = {
   0xbeL, 
};
static final long[] jjtoSpecial = {
   0x80L, 
};
static final long[] jjtoMore = {
   0x140L, 
};
static private ASCII_CharStream input_stream;
static private final int[] jjrounds = new int[6];
static private final int[] jjstateSet = new int[12];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
public MiniParserTokenManager(ASCII_CharStream stream)
{
   if (input_stream != null) {
    throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
}
   input_stream = stream;
}
public MiniParserTokenManager(ASCII_CharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(ASCII_CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;) {
    jjrounds[i] = 0x80000000;
}
}
static public void ReInit(ASCII_CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0) {
    throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
} else {
    curLexState = lexState;
}
}

static private Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? ASCII_CharStream.GetImage() : im;
   t.beginLine = ASCII_CharStream.getBeginLine();
   t.beginColumn = ASCII_CharStream.getBeginColumn();
   t.endLine = ASCII_CharStream.getEndLine();
   t.endColumn = ASCII_CharStream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = ASCII_CharStream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { ASCII_CharStream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L) {
                curChar = ASCII_CharStream.BeginToken();
            }
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos) {
            ASCII_CharStream.backup(curPos - jjmatchedPos - 1);
        }
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1) {
        curLexState = jjnewLexState[jjmatchedKind];
    }
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null) {
                specialToken = matchedToken;
            } else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           } else {
            SkipLexicalActions(null);
        }
         if (jjnewLexState[jjmatchedKind] != -1) {
            curLexState = jjnewLexState[jjmatchedKind];
        }
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1) {
        curLexState = jjnewLexState[jjmatchedKind];
    }
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = ASCII_CharStream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = ASCII_CharStream.getEndLine();
     int error_column = ASCII_CharStream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { ASCII_CharStream.readChar(); ASCII_CharStream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : ASCII_CharStream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        } else {
            error_column++;
        }
     }
     if (!EOFSeen) {
        ASCII_CharStream.backup(1);
        error_after = curPos <= 1 ? "" : ASCII_CharStream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
}
