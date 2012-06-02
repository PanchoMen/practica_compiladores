// $ANTLR 3.4 /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g 2012-05-18 18:21:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class mdParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIASA", "Bool", "Fecha", "Hora", "Int", "LengTipo", "String", "UbicacionC", "'!'", "'!='", "'##'", "'#'", "'$$'", "'$'", "'%='", "'&&'", "'('", "')'", "'*'", "'+'", "'++'", "','", "'-'", "'.'", "'..'", "'/'", "'//'", "'/class'", "'/in'", "'/out'", "':'", "';'", "'<'", "'<='", "'=%'", "'=='", "'>'", "'>='", "'class'", "'dir'", "'else'", "'if'", "'in'", "'nombre'", "'out'", "'while'", "'{'", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ALIASA=4;
    public static final int Bool=5;
    public static final int Fecha=6;
    public static final int Hora=7;
    public static final int Int=8;
    public static final int LengTipo=9;
    public static final int String=10;
    public static final int UbicacionC=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public mdParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public mdParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return mdParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g"; }



    // $ANTLR start "prog"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:3:1: prog : md EOF ;
    public final void prog() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:3:11: ( md EOF )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:3:19: md EOF
            {
            pushFollow(FOLLOW_md_in_prog21);
            md();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_prog23); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "md"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:1: md : ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ ;
    public final void md() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:6: ( ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:8: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:8: ( listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 42:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;
                case 18:
                    {
                    alt1=4;
                    }
                    break;
                case 15:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:9: listLengArchivo
            	    {
            	    pushFollow(FOLLOW_listLengArchivo_in_md33);
            	    listLengArchivo();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:27: listLengClases
            	    {
            	    pushFollow(FOLLOW_listLengClases_in_md37);
            	    listLengClases();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:44: listLengComandos
            	    {
            	    pushFollow(FOLLOW_listLengComandos_in_md41);
            	    listLengComandos();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:63: listLengFns
            	    {
            	    pushFollow(FOLLOW_listLengFns_in_md45);
            	    listLengFns();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:4:77: listLengApp
            	    {
            	    pushFollow(FOLLOW_listLengApp_in_md49);
            	    listLengApp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "md"



    // $ANTLR start "listLengArchivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:13:1: listLengArchivo : '$' ALIASA '.' ALIASA opcionesA '$$' ;
    public final void listLengArchivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:13:18: ( '$' ALIASA '.' ALIASA opcionesA '$$' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:13:20: '$' ALIASA '.' ALIASA opcionesA '$$'
            {
            match(input,17,FOLLOW_17_in_listLengArchivo97); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo99); 

            match(input,27,FOLLOW_27_in_listLengArchivo101); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengArchivo103); 

            pushFollow(FOLLOW_opcionesA_in_listLengArchivo105);
            opcionesA();

            state._fsp--;


            match(input,16,FOLLOW_16_in_listLengArchivo107); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengArchivo"



    // $ANTLR start "opcionesA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:1: opcionesA : '{' ubicacionA ( Fecha |) ( Hora |) '}' ;
    public final void opcionesA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:12: ( '{' ubicacionA ( Fecha |) ( Hora |) '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:14: '{' ubicacionA ( Fecha |) ( Hora |) '}'
            {
            match(input,50,FOLLOW_50_in_opcionesA115); 

            pushFollow(FOLLOW_ubicacionA_in_opcionesA117);
            ubicacionA();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:29: ( Fecha |)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Fecha) ) {
                alt2=1;
            }
            else if ( (LA2_0==Hora||LA2_0==52) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:30: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_opcionesA120); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:38: 
                    {
                    }
                    break;

            }


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:40: ( Hora |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Hora) ) {
                alt3=1;
            }
            else if ( (LA3_0==52) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:41: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_opcionesA127); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:14:48: 
                    {
                    }
                    break;

            }


            match(input,52,FOLLOW_52_in_opcionesA133); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opcionesA"



    // $ANTLR start "ubicacionA"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:15:1: ubicacionA : ( relativa | absoluta |);
    public final void ubicacionA() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:15:13: ( relativa | absoluta |)
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case Fecha:
            case Hora:
            case 52:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:15:15: relativa
                    {
                    pushFollow(FOLLOW_relativa_in_ubicacionA141);
                    relativa();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:15:26: absoluta
                    {
                    pushFollow(FOLLOW_absoluta_in_ubicacionA145);
                    absoluta();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:15:37: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ubicacionA"



    // $ANTLR start "absoluta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:16:1: absoluta : ( '/' ALIASA )+ ;
    public final void absoluta() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:16:11: ( ( '/' ALIASA )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:16:13: ( '/' ALIASA )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:16:13: ( '/' ALIASA )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:16:14: '/' ALIASA
            	    {
            	    match(input,29,FOLLOW_29_in_absoluta157); 

            	    match(input,ALIASA,FOLLOW_ALIASA_in_absoluta158); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "absoluta"



    // $ANTLR start "relativa"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:17:1: relativa : relativaP ( '/' ALIASA )+ ;
    public final void relativa() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:17:11: ( relativaP ( '/' ALIASA )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:17:13: relativaP ( '/' ALIASA )+
            {
            pushFollow(FOLLOW_relativaP_in_relativa168);
            relativaP();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:17:23: ( '/' ALIASA )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:17:24: '/' ALIASA
            	    {
            	    match(input,29,FOLLOW_29_in_relativa171); 

            	    match(input,ALIASA,FOLLOW_ALIASA_in_relativa172); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relativa"



    // $ANTLR start "relativaP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:18:1: relativaP : ( '.' | '..' );
    public final void relativaP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:18:12: ( '.' | '..' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:
            {
            if ( (input.LA(1) >= 27 && input.LA(1) <= 28) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relativaP"



    // $ANTLR start "listLengClases"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:24:1: listLengClases : 'class' ALIASA ( ALIASA )+ propiedad '/class' ;
    public final void listLengClases() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:24:17: ( 'class' ALIASA ( ALIASA )+ propiedad '/class' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:24:19: 'class' ALIASA ( ALIASA )+ propiedad '/class'
            {
            match(input,42,FOLLOW_42_in_listLengClases294); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases296); 

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:24:34: ( ALIASA )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ALIASA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:24:35: ALIASA
            	    {
            	    match(input,ALIASA,FOLLOW_ALIASA_in_listLengClases299); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            pushFollow(FOLLOW_propiedad_in_listLengClases303);
            propiedad();

            state._fsp--;


            match(input,31,FOLLOW_31_in_listLengClases305); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengClases"



    // $ANTLR start "propiedad"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:26:1: propiedad : ( tripleta )+ ;
    public final void propiedad() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:26:12: ( ( tripleta )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:26:14: ( tripleta )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:26:14: ( tripleta )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LengTipo) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:26:15: tripleta
            	    {
            	    pushFollow(FOLLOW_tripleta_in_propiedad315);
            	    tripleta();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "propiedad"



    // $ANTLR start "tripleta"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:27:1: tripleta : LengTipo ':' ALIASA '~' expresion ',' ;
    public final void tripleta() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:27:11: ( LengTipo ':' ALIASA '~' expresion ',' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:27:13: LengTipo ':' ALIASA '~' expresion ','
            {
            match(input,LengTipo,FOLLOW_LengTipo_in_tripleta325); 

            match(input,34,FOLLOW_34_in_tripleta327); 

            match(input,ALIASA,FOLLOW_ALIASA_in_tripleta329); 

            match(input,53,FOLLOW_53_in_tripleta331); 

            pushFollow(FOLLOW_expresion_in_tripleta333);
            expresion();

            state._fsp--;


            match(input,25,FOLLOW_25_in_tripleta335); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "tripleta"



    // $ANTLR start "listLengComandos"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:31:1: listLengComandos : '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' ;
    public final void listLengComandos() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:31:18: ( '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:31:20: '+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++'
            {
            match(input,23,FOLLOW_23_in_listLengComandos345); 

            match(input,47,FOLLOW_47_in_listLengComandos347); 

            match(input,53,FOLLOW_53_in_listLengComandos349); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengComandos351); 

            match(input,43,FOLLOW_43_in_listLengComandos353); 

            match(input,53,FOLLOW_53_in_listLengComandos355); 

            match(input,UbicacionC,FOLLOW_UbicacionC_in_listLengComandos357); 

            match(input,24,FOLLOW_24_in_listLengComandos359); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengComandos"



    // $ANTLR start "listLengApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:36:1: listLengApp : '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' ;
    public final void listLengApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:36:14: ( '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:36:16: '#' Int ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##'
            {
            match(input,15,FOLLOW_15_in_listLengApp383); 

            match(input,Int,FOLLOW_Int_in_listLengApp385); 

            match(input,ALIASA,FOLLOW_ALIASA_in_listLengApp389); 

            match(input,46,FOLLOW_46_in_listLengApp391); 

            pushFollow(FOLLOW_argumentoIN_in_listLengApp393);
            argumentoIN();

            state._fsp--;


            match(input,32,FOLLOW_32_in_listLengApp395); 

            match(input,48,FOLLOW_48_in_listLengApp397); 

            pushFollow(FOLLOW_argumentoOUT_in_listLengApp399);
            argumentoOUT();

            state._fsp--;


            match(input,33,FOLLOW_33_in_listLengApp401); 

            pushFollow(FOLLOW_opcionesApp_in_listLengApp403);
            opcionesApp();

            state._fsp--;


            pushFollow(FOLLOW_descripcionApp_in_listLengApp405);
            descripcionApp();

            state._fsp--;


            match(input,14,FOLLOW_14_in_listLengApp407); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengApp"



    // $ANTLR start "argumentoIN"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:1: argumentoIN : ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN );
    public final void argumentoIN() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:14: ( archivo | ALIASA | archivo argumentoIN | ALIASA argumentoIN )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ALIASA) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==ALIASA) ) {
                        int LA9_5 = input.LA(4);

                        if ( (LA9_5==32) ) {
                            alt9=1;
                        }
                        else if ( (LA9_5==ALIASA) ) {
                            alt9=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case 32:
                    {
                    alt9=2;
                    }
                    break;
                case ALIASA:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:16: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN415);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:36: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN421); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:45: archivo argumentoIN
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoIN425);
                    archivo();

                    state._fsp--;


                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN427);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:37:77: ALIASA argumentoIN
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoIN433); 

                    pushFollow(FOLLOW_argumentoIN_in_argumentoIN435);
                    argumentoIN();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumentoIN"



    // $ANTLR start "archivo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:38:1: archivo : ALIASA '.' ALIASA ;
    public final void archivo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:38:11: ( ALIASA '.' ALIASA )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:38:14: ALIASA '.' ALIASA
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_archivo445); 

            match(input,27,FOLLOW_27_in_archivo447); 

            match(input,ALIASA,FOLLOW_ALIASA_in_archivo449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "archivo"



    // $ANTLR start "argumentoOUT"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:39:1: argumentoOUT : ( archivo | ALIASA );
    public final void argumentoOUT() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:39:15: ( archivo | ALIASA )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ALIASA) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==27) ) {
                    alt10=1;
                }
                else if ( (LA10_1==33) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:39:17: archivo
                    {
                    pushFollow(FOLLOW_archivo_in_argumentoOUT457);
                    archivo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:39:37: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_argumentoOUT463); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumentoOUT"



    // $ANTLR start "opcionesApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:40:1: opcionesApp : ( '-' ALIASA opcionesApp | '-' ALIASA );
    public final void opcionesApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:40:14: ( '-' ALIASA opcionesApp | '-' ALIASA )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ALIASA) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==26) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==ALIASA||LA11_2==14) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:40:16: '-' ALIASA opcionesApp
                    {
                    match(input,26,FOLLOW_26_in_opcionesApp472); 

                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp474); 

                    pushFollow(FOLLOW_opcionesApp_in_opcionesApp476);
                    opcionesApp();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:40:41: '-' ALIASA
                    {
                    match(input,26,FOLLOW_26_in_opcionesApp480); 

                    match(input,ALIASA,FOLLOW_ALIASA_in_opcionesApp482); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opcionesApp"



    // $ANTLR start "descripcionApp"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:41:1: descripcionApp : ( ALIASA |);
    public final void descripcionApp() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:41:17: ( ALIASA |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ALIASA) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:41:19: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_descripcionApp490); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:41:28: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "descripcionApp"



    // $ANTLR start "expresion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:1: expresion : conjuncion ( expresionP |) ;
    public final void expresion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:12: ( conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:14: conjuncion ( expresionP |)
            {
            pushFollow(FOLLOW_conjuncion_in_expresion503);
            conjuncion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:25: ( expresionP |)
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            else if ( (LA13_0==21||LA13_0==25||LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:26: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresion506);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:44:39: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expresion"



    // $ANTLR start "expresionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:1: expresionP : '||' conjuncion ( expresionP |) ;
    public final void expresionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:13: ( '||' conjuncion ( expresionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:15: '||' conjuncion ( expresionP |)
            {
            match(input,51,FOLLOW_51_in_expresionP518); 

            pushFollow(FOLLOW_conjuncion_in_expresionP520);
            conjuncion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:31: ( expresionP |)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==51) ) {
                alt14=1;
            }
            else if ( (LA14_0==21||LA14_0==25||LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:32: expresionP
                    {
                    pushFollow(FOLLOW_expresionP_in_expresionP523);
                    expresionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:45:45: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expresionP"



    // $ANTLR start "conjuncion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:1: conjuncion : relacion ( conjuncionP |) ;
    public final void conjuncion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:13: ( relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:15: relacion ( conjuncionP |)
            {
            pushFollow(FOLLOW_relacion_in_conjuncion535);
            relacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:24: ( conjuncionP |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==21||LA15_0==25||LA15_0==35||LA15_0==51) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:25: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncion538);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:46:39: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "conjuncion"



    // $ANTLR start "conjuncionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:1: conjuncionP : '&&' relacion ( conjuncionP |) ;
    public final void conjuncionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:14: ( '&&' relacion ( conjuncionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:16: '&&' relacion ( conjuncionP |)
            {
            match(input,19,FOLLOW_19_in_conjuncionP550); 

            pushFollow(FOLLOW_relacion_in_conjuncionP552);
            relacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:30: ( conjuncionP |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            else if ( (LA16_0==21||LA16_0==25||LA16_0==35||LA16_0==51) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:31: conjuncionP
                    {
                    pushFollow(FOLLOW_conjuncionP_in_conjuncionP555);
                    conjuncionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:47:45: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "conjuncionP"



    // $ANTLR start "relacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:1: relacion : adicion ( relacionP |) ;
    public final void relacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:11: ( adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:13: adicion ( relacionP |)
            {
            pushFollow(FOLLOW_adicion_in_relacion567);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:21: ( relacionP |)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==19||LA17_0==21||LA17_0==25||LA17_0==35||LA17_0==51) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:22: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacion570);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:48:34: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relacion"



    // $ANTLR start "relacionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:1: relacionP : '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) ;
    public final void relacionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:12: ( '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:14: '<' adicion ( relacionP |) '<=' adicion ( relacionP |) '>' adicion ( relacionP |) '>=' adicion ( relacionP |) '==' adicion ( relacionP |) '!=' adicion ( relacionP |)
            {
            match(input,36,FOLLOW_36_in_relacionP582); 

            pushFollow(FOLLOW_adicion_in_relacionP584);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:26: ( relacionP |)
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:27: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP587);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:39: 
                    {
                    }
                    break;

            }


            match(input,37,FOLLOW_37_in_relacionP592); 

            pushFollow(FOLLOW_adicion_in_relacionP594);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:53: ( relacionP |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==40) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:54: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP597);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:66: 
                    {
                    }
                    break;

            }


            match(input,40,FOLLOW_40_in_relacionP602); 

            pushFollow(FOLLOW_adicion_in_relacionP604);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:79: ( relacionP |)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:80: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP607);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:92: 
                    {
                    }
                    break;

            }


            match(input,41,FOLLOW_41_in_relacionP612); 

            pushFollow(FOLLOW_adicion_in_relacionP614);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:106: ( relacionP |)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:107: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP617);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:49:119: 
                    {
                    }
                    break;

            }


            match(input,39,FOLLOW_39_in_relacionP627); 

            pushFollow(FOLLOW_adicion_in_relacionP629);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:18: ( relacionP |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==13) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:19: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP632);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:31: 
                    {
                    }
                    break;

            }


            match(input,13,FOLLOW_13_in_relacionP637); 

            pushFollow(FOLLOW_adicion_in_relacionP639);
            adicion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:45: ( relacionP |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==13||LA23_0==19||LA23_0==21||LA23_0==25||LA23_0==35||LA23_0==37||(LA23_0 >= 39 && LA23_0 <= 41)||LA23_0==51) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:46: relacionP
                    {
                    pushFollow(FOLLOW_relacionP_in_relacionP642);
                    relacionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:50:58: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "relacionP"



    // $ANTLR start "adicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:1: adicion : termino ( adicionP |) ;
    public final void adicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:11: ( termino ( adicionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:13: termino ( adicionP |)
            {
            pushFollow(FOLLOW_termino_in_adicion655);
            termino();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:21: ( adicionP |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            else if ( (LA24_0==13||LA24_0==19||LA24_0==21||LA24_0==25||(LA24_0 >= 35 && LA24_0 <= 37)||(LA24_0 >= 39 && LA24_0 <= 41)||LA24_0==51) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:22: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicion658);
                    adicionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:51:33: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "adicion"



    // $ANTLR start "adicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:1: adicionP : '+' termino ( adicionP |) '-' termino ( adicionP |) ;
    public final void adicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:11: ( '+' termino ( adicionP |) '-' termino ( adicionP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:13: '+' termino ( adicionP |) '-' termino ( adicionP |)
            {
            match(input,23,FOLLOW_23_in_adicionP670); 

            pushFollow(FOLLOW_termino_in_adicionP672);
            termino();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:25: ( adicionP |)
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            else if ( (LA25_0==26) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:26: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicionP675);
                    adicionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:37: 
                    {
                    }
                    break;

            }


            match(input,26,FOLLOW_26_in_adicionP681); 

            pushFollow(FOLLOW_termino_in_adicionP683);
            termino();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:51: ( adicionP |)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            else if ( (LA26_0==13||LA26_0==19||LA26_0==21||(LA26_0 >= 25 && LA26_0 <= 26)||(LA26_0 >= 35 && LA26_0 <= 37)||(LA26_0 >= 39 && LA26_0 <= 41)||LA26_0==51) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:52: adicionP
                    {
                    pushFollow(FOLLOW_adicionP_in_adicionP686);
                    adicionP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:52:63: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "adicionP"



    // $ANTLR start "termino"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:1: termino : negacion ( terminoP |) ;
    public final void termino() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:11: ( negacion ( terminoP |) )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:13: negacion ( terminoP |)
            {
            pushFollow(FOLLOW_negacion_in_termino699);
            negacion();

            state._fsp--;


            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:22: ( terminoP |)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22||LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==13||LA27_0==19||LA27_0==21||LA27_0==23||(LA27_0 >= 25 && LA27_0 <= 26)||(LA27_0 >= 35 && LA27_0 <= 37)||(LA27_0 >= 39 && LA27_0 <= 41)||LA27_0==51) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:23: terminoP
                    {
                    pushFollow(FOLLOW_terminoP_in_termino702);
                    terminoP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:53:34: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "termino"



    // $ANTLR start "terminoP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:1: terminoP : ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) );
    public final void terminoP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:11: ( '*' negacion ( terminoP |) | '//' negacion ( terminoP |) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            else if ( (LA30_0==30) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:13: '*' negacion ( terminoP |)
                    {
                    match(input,22,FOLLOW_22_in_terminoP714); 

                    pushFollow(FOLLOW_negacion_in_terminoP716);
                    negacion();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:26: ( terminoP |)
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==22||LA28_0==30) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==13||LA28_0==19||LA28_0==21||LA28_0==23||(LA28_0 >= 25 && LA28_0 <= 26)||(LA28_0 >= 35 && LA28_0 <= 37)||(LA28_0 >= 39 && LA28_0 <= 41)||LA28_0==51) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:27: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP719);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:38: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:42: '//' negacion ( terminoP |)
                    {
                    match(input,30,FOLLOW_30_in_terminoP727); 

                    pushFollow(FOLLOW_negacion_in_terminoP729);
                    negacion();

                    state._fsp--;


                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:56: ( terminoP |)
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==22||LA29_0==30) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==13||LA29_0==19||LA29_0==21||LA29_0==23||(LA29_0 >= 25 && LA29_0 <= 26)||(LA29_0 >= 35 && LA29_0 <= 37)||(LA29_0 >= 39 && LA29_0 <= 41)||LA29_0==51) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:57: terminoP
                            {
                            pushFollow(FOLLOW_terminoP_in_terminoP732);
                            terminoP();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:54:68: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "terminoP"



    // $ANTLR start "negacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:55:1: negacion : ( factor | '!' factor );
    public final void negacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:55:11: ( factor | '!' factor )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0 >= ALIASA && LA31_0 <= String)||LA31_0==20||(LA31_0 >= 27 && LA31_0 <= 29)||LA31_0==42) ) {
                alt31=1;
            }
            else if ( (LA31_0==12) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:55:13: factor
                    {
                    pushFollow(FOLLOW_factor_in_negacion744);
                    factor();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:55:22: '!' factor
                    {
                    match(input,12,FOLLOW_12_in_negacion748); 

                    pushFollow(FOLLOW_factor_in_negacion749);
                    factor();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "negacion"



    // $ANTLR start "factor"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:1: factor : ( ALIASA | tripleta | literal | '(' expresion ')' );
    public final void factor() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:10: ( ALIASA | tripleta | literal | '(' expresion ')' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt32=1;
                }
                break;
            case LengTipo:
                {
                alt32=2;
                }
                break;
            case Bool:
            case Fecha:
            case Hora:
            case Int:
            case String:
            case 27:
            case 28:
            case 29:
            case 42:
                {
                alt32=3;
                }
                break;
            case 20:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:12: ALIASA
                    {
                    match(input,ALIASA,FOLLOW_ALIASA_in_factor758); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:21: tripleta
                    {
                    pushFollow(FOLLOW_tripleta_in_factor762);
                    tripleta();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:32: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor766);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:56:42: '(' expresion ')'
                    {
                    match(input,20,FOLLOW_20_in_factor770); 

                    pushFollow(FOLLOW_expresion_in_factor772);
                    expresion();

                    state._fsp--;


                    match(input,21,FOLLOW_21_in_factor775); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "listLengFns"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:1: listLengFns : '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' ;
    public final void listLengFns() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:14: ( '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:16: '%=' literal ALIASA '(' literal ALIASA ( ',' ( literal ALIASA ) )* ')' '{' instrucciones '}' '=%'
            {
            match(input,18,FOLLOW_18_in_listLengFns786); 

            pushFollow(FOLLOW_literal_in_listLengFns788);
            literal();

            state._fsp--;


            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns790); 

            match(input,20,FOLLOW_20_in_listLengFns792); 

            pushFollow(FOLLOW_literal_in_listLengFns794);
            literal();

            state._fsp--;


            match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns796); 

            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:55: ( ',' ( literal ALIASA ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:56: ',' ( literal ALIASA )
            	    {
            	    match(input,25,FOLLOW_25_in_listLengFns799); 

            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:59: ( literal ALIASA )
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:60:60: literal ALIASA
            	    {
            	    pushFollow(FOLLOW_literal_in_listLengFns801);
            	    literal();

            	    state._fsp--;


            	    match(input,ALIASA,FOLLOW_ALIASA_in_listLengFns803); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input,21,FOLLOW_21_in_listLengFns808); 

            match(input,50,FOLLOW_50_in_listLengFns810); 

            pushFollow(FOLLOW_instrucciones_in_listLengFns812);
            instrucciones();

            state._fsp--;


            match(input,52,FOLLOW_52_in_listLengFns814); 

            match(input,38,FOLLOW_38_in_listLengFns816); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listLengFns"



    // $ANTLR start "literal"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:1: literal : ( Int | Bool | Fecha | Hora | file | listLengClases | String );
    public final void literal() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:11: ( Int | Bool | Fecha | Hora | file | listLengClases | String )
            int alt34=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt34=1;
                }
                break;
            case Bool:
                {
                alt34=2;
                }
                break;
            case Fecha:
                {
                alt34=3;
                }
                break;
            case Hora:
                {
                alt34=4;
                }
                break;
            case 27:
            case 28:
            case 29:
                {
                alt34=5;
                }
                break;
            case 42:
                {
                alt34=6;
                }
                break;
            case String:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:13: Int
                    {
                    match(input,Int,FOLLOW_Int_in_literal825); 

                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:19: Bool
                    {
                    match(input,Bool,FOLLOW_Bool_in_literal829); 

                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:26: Fecha
                    {
                    match(input,Fecha,FOLLOW_Fecha_in_literal833); 

                    }
                    break;
                case 4 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:34: Hora
                    {
                    match(input,Hora,FOLLOW_Hora_in_literal837); 

                    }
                    break;
                case 5 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:41: file
                    {
                    pushFollow(FOLLOW_file_in_literal841);
                    file();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:48: listLengClases
                    {
                    pushFollow(FOLLOW_listLengClases_in_literal845);
                    listLengClases();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:61:65: String
                    {
                    match(input,String,FOLLOW_String_in_literal849); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "file"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:65:1: file : ( relativa | absoluta );
    public final void file() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:65:8: ( relativa | absoluta )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0 >= 27 && LA35_0 <= 28)) ) {
                alt35=1;
            }
            else if ( (LA35_0==29) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:65:10: relativa
                    {
                    pushFollow(FOLLOW_relativa_in_file938);
                    relativa();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:65:21: absoluta
                    {
                    pushFollow(FOLLOW_absoluta_in_file942);
                    absoluta();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "file"



    // $ANTLR start "z"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:67:1: z : ( listVariables listInstrucciones |);
    public final void z() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:67:5: ( listVariables listInstrucciones |)
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LengTipo) ) {
                alt36=1;
            }
            else if ( (LA36_0==EOF) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:67:7: listVariables listInstrucciones
                    {
                    pushFollow(FOLLOW_listVariables_in_z979);
                    listVariables();

                    state._fsp--;


                    pushFollow(FOLLOW_listInstrucciones_in_z981);
                    listInstrucciones();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:67:41: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "z"



    // $ANTLR start "listVariables"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:68:1: listVariables : ( lengVar )+ ;
    public final void listVariables() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:68:16: ( ( lengVar )+ )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:68:18: ( lengVar )+
            {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:68:18: ( lengVar )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LengTipo) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:68:19: lengVar
            	    {
            	    pushFollow(FOLLOW_lengVar_in_listVariables993);
            	    lengVar();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listVariables"



    // $ANTLR start "lengVar"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:69:1: lengVar : LengTipo ALIASA ';' ;
    public final void lengVar() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:69:11: ( LengTipo ALIASA ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:69:13: LengTipo ALIASA ';'
            {
            match(input,LengTipo,FOLLOW_LengTipo_in_lengVar1004); 

            match(input,ALIASA,FOLLOW_ALIASA_in_lengVar1006); 

            match(input,35,FOLLOW_35_in_lengVar1008); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lengVar"



    // $ANTLR start "listInstrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:1: listInstrucciones : ( ( instrucciones )+ |);
    public final void listInstrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:20: ( ( instrucciones )+ |)
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ALIASA||LA39_0==45||LA39_0==49) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF||LA39_0==52) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:22: ( instrucciones )+
                    {
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:22: ( instrucciones )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==ALIASA||LA38_0==45||LA38_0==49) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:23: instrucciones
                    	    {
                    	    pushFollow(FOLLOW_instrucciones_in_listInstrucciones1017);
                    	    instrucciones();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:70:41: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listInstrucciones"



    // $ANTLR start "instrucciones"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:71:1: instrucciones : ( asignacion | ciclo | condicion );
    public final void instrucciones() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:71:16: ( asignacion | ciclo | condicion )
            int alt40=3;
            switch ( input.LA(1) ) {
            case ALIASA:
                {
                alt40=1;
                }
                break;
            case 49:
                {
                alt40=2;
                }
                break;
            case 45:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:71:19: asignacion
                    {
                    pushFollow(FOLLOW_asignacion_in_instrucciones1031);
                    asignacion();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:71:32: ciclo
                    {
                    pushFollow(FOLLOW_ciclo_in_instrucciones1035);
                    ciclo();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:71:40: condicion
                    {
                    pushFollow(FOLLOW_condicion_in_instrucciones1039);
                    condicion();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instrucciones"



    // $ANTLR start "condicion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:72:1: condicion : condicionP 'else' '{' listInstrucciones '}' ;
    public final void condicion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:72:12: ( condicionP 'else' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:72:14: condicionP 'else' '{' listInstrucciones '}'
            {
            pushFollow(FOLLOW_condicionP_in_condicion1047);
            condicionP();

            state._fsp--;


            match(input,44,FOLLOW_44_in_condicion1049); 

            match(input,50,FOLLOW_50_in_condicion1051); 

            pushFollow(FOLLOW_listInstrucciones_in_condicion1053);
            listInstrucciones();

            state._fsp--;


            match(input,52,FOLLOW_52_in_condicion1055); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condicion"



    // $ANTLR start "condicionP"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:73:1: condicionP : 'if' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void condicionP() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:73:13: ( 'if' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:73:15: 'if' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,45,FOLLOW_45_in_condicionP1063); 

            match(input,20,FOLLOW_20_in_condicionP1065); 

            pushFollow(FOLLOW_expresion_in_condicionP1067);
            expresion();

            state._fsp--;


            match(input,21,FOLLOW_21_in_condicionP1069); 

            match(input,50,FOLLOW_50_in_condicionP1071); 

            pushFollow(FOLLOW_listInstrucciones_in_condicionP1073);
            listInstrucciones();

            state._fsp--;


            match(input,52,FOLLOW_52_in_condicionP1075); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condicionP"



    // $ANTLR start "ciclo"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:74:1: ciclo : 'while' '(' expresion ')' '{' listInstrucciones '}' ;
    public final void ciclo() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:74:9: ( 'while' '(' expresion ')' '{' listInstrucciones '}' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:74:11: 'while' '(' expresion ')' '{' listInstrucciones '}'
            {
            match(input,49,FOLLOW_49_in_ciclo1084); 

            match(input,20,FOLLOW_20_in_ciclo1086); 

            pushFollow(FOLLOW_expresion_in_ciclo1088);
            expresion();

            state._fsp--;


            match(input,21,FOLLOW_21_in_ciclo1090); 

            match(input,50,FOLLOW_50_in_ciclo1092); 

            pushFollow(FOLLOW_listInstrucciones_in_ciclo1094);
            listInstrucciones();

            state._fsp--;


            match(input,52,FOLLOW_52_in_ciclo1096); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ciclo"



    // $ANTLR start "asignacion"
    // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:75:1: asignacion : ALIASA '~' expresion ';' ;
    public final void asignacion() throws RecognitionException {
        try {
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:75:14: ( ALIASA '~' expresion ';' )
            // /home/jvidalva/Escritorio/practica_compiladoresmd/trunk/src/Antlr/md.g:75:16: ALIASA '~' expresion ';'
            {
            match(input,ALIASA,FOLLOW_ALIASA_in_asignacion1105); 

            match(input,53,FOLLOW_53_in_asignacion1107); 

            pushFollow(FOLLOW_expresion_in_asignacion1109);
            expresion();

            state._fsp--;


            match(input,35,FOLLOW_35_in_asignacion1111); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "asignacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_md_in_prog21 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengArchivo_in_md33 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengClases_in_md37 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengComandos_in_md41 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengFns_in_md45 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_listLengApp_in_md49 = new BitSet(new long[]{0x0000040000868002L});
    public static final BitSet FOLLOW_17_in_listLengArchivo97 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo99 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_listLengArchivo101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengArchivo103 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_opcionesA_in_listLengArchivo105 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_listLengArchivo107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_opcionesA115 = new BitSet(new long[]{0x00100000380000C0L});
    public static final BitSet FOLLOW_ubicacionA_in_opcionesA117 = new BitSet(new long[]{0x00100000000000C0L});
    public static final BitSet FOLLOW_Fecha_in_opcionesA120 = new BitSet(new long[]{0x0010000000000080L});
    public static final BitSet FOLLOW_Hora_in_opcionesA127 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_opcionesA133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_ubicacionA141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluta_in_ubicacionA145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_absoluta157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_absoluta158 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_relativaP_in_relativa168 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_relativa171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_relativa172 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_42_in_listLengClases294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengClases299 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_propiedad_in_listLengClases303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_listLengClases305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_propiedad315 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_LengTipo_in_tripleta325 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_tripleta327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_tripleta329 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_tripleta331 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_tripleta333 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_tripleta335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_listLengComandos345 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_listLengComandos347 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_listLengComandos349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengComandos351 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_listLengComandos353 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_listLengComandos355 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_UbicacionC_in_listLengComandos357 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_listLengComandos359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_listLengApp383 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Int_in_listLengApp385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengApp389 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_listLengApp391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_listLengApp393 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_listLengApp395 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_listLengApp397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoOUT_in_listLengApp399 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_listLengApp401 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_opcionesApp_in_listLengApp403 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_descripcionApp_in_listLengApp405 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_listLengApp407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoIN425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoIN433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_argumentoIN_in_argumentoIN435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_archivo445 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_archivo447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_archivo449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_archivo_in_argumentoOUT457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_argumentoOUT463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_opcionesApp472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp474 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_opcionesApp_in_opcionesApp476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_opcionesApp480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_opcionesApp482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_descripcionApp490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjuncion_in_expresion503 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresion506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_expresionP518 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_conjuncion_in_expresionP520 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_expresionP_in_expresionP523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relacion_in_conjuncion535 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncion538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_conjuncionP550 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_relacion_in_conjuncionP552 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_conjuncionP_in_conjuncionP555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adicion_in_relacion567 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacion570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_relacionP582 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP584 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP587 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_relacionP592 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP594 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP597 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_relacionP602 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP604 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP607 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_relacionP612 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP614 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP617 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_relacionP627 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP629 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_relacionP_in_relacionP632 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_relacionP637 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_adicion_in_relacionP639 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_relacionP_in_relacionP642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termino_in_adicion655 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_adicionP_in_adicion658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_adicionP670 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_termino_in_adicionP672 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_adicionP_in_adicionP675 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_adicionP681 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_termino_in_adicionP683 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_adicionP_in_adicionP686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negacion_in_termino699 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_termino702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_terminoP714 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_negacion_in_terminoP716 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_terminoP727 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_negacion_in_terminoP729 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_terminoP_in_terminoP732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_negacion744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_negacion748 = new BitSet(new long[]{0x00000400381007F0L});
    public static final BitSet FOLLOW_factor_in_negacion749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_factor758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tripleta_in_factor762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_factor770 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_factor772 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_factor775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_listLengFns786 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns790 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_listLengFns792 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns796 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_listLengFns799 = new BitSet(new long[]{0x00000400380005E0L});
    public static final BitSet FOLLOW_literal_in_listLengFns801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_listLengFns803 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_listLengFns808 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_listLengFns810 = new BitSet(new long[]{0x0002200000000010L});
    public static final BitSet FOLLOW_instrucciones_in_listLengFns812 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_listLengFns814 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_listLengFns816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_literal825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_literal829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fecha_in_literal833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hora_in_literal837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_in_literal841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLengClases_in_literal845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_literal849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativa_in_file938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluta_in_file942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_z979 = new BitSet(new long[]{0x0002200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_z981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lengVar_in_listVariables993 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_LengTipo_in_lengVar1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALIASA_in_lengVar1006 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_lengVar1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucciones_in_listInstrucciones1017 = new BitSet(new long[]{0x0002200000000012L});
    public static final BitSet FOLLOW_asignacion_in_instrucciones1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ciclo_in_instrucciones1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicion_in_instrucciones1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicionP_in_condicion1047 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_condicion1049 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condicion1051 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicion1053 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicion1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_condicionP1063 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_condicionP1065 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_condicionP1067 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_condicionP1069 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condicionP1071 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_condicionP1073 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condicionP1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ciclo1084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ciclo1086 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_ciclo1088 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ciclo1090 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ciclo1092 = new BitSet(new long[]{0x0012200000000010L});
    public static final BitSet FOLLOW_listInstrucciones_in_ciclo1094 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ciclo1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALIASA_in_asignacion1105 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_asignacion1107 = new BitSet(new long[]{0x00000400381017F0L});
    public static final BitSet FOLLOW_expresion_in_asignacion1109 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_asignacion1111 = new BitSet(new long[]{0x0000000000000002L});

}