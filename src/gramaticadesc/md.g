grammar md;              
options 
{
            output=AST;
}



@members {
protected void mismatch(IntStream input, int ttype, BitSet follow)
    throws RecognitionException
{
    throw new MismatchedTokenException(ttype, input);
}

public Object recoverFromMismatchedSet(IntStream input,
                                     RecognitionException e,
                                     BitSet follow)
    throws RecognitionException
{
    throw e;
}
        }
        
@rulecatch  {
            catch (RecognitionException e) 
            {
                throw e;
            }
        }

prog    		:       md EOF;
md			:	(listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp)+;

//Elementos comunes

LengTipo	:	'int' | 'bool' | 'date' | 'hour' | 'file' | 'class' | 'string';


//Lenguaje de archivos

listLengArchivo		:	'$' ALIASA '.' ALIASA opcionesA '$$';
opcionesA		:	'{' (ubicacionA | ) (Fecha | ) (Hora | ) '}';
ubicacionA		:	relativa | absoluta;
absoluta		:	('/'ALIASA)+;
relativa		:	'.'('/'ALIASA)+ | '..'('/'ALIASA)*;
//relativaP		: 	'.' | '..';
Fecha			:	(('0'..'9')('0'..'9') '/' ('0'..'9')('0'..'9') '/' ('0'..'9')('0'..'9')('0'..'9')('0'..'9'));
Hora			:	(('0'..'9')('0'..'9')':'('0'..'9')('0'..'9')':'('0'..'9')('0'..'9'));

//Lenguaje de clases

listLengClases		:	'class' ALIASA (ALIASA)+ propiedad '/class';
//DescripcionClases	:	(('a'..'z') | ('A'..'Z') | ('0'..'9'))+;
propiedad		:	(tripleta)+;
tripleta		:	LengTipo ':' ALIASA '~' expresion ',';

//Lenguaje de comandos

listLengComandos	:	'+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++';
UbicacionC		:	('/'ALIASA)+'/';

//Lenguaje de aplicación 

listLengApp		:	'#' Int /*Comandos*/ ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##';
argumentoIN		:	archivo | /*Clase*/ ALIASA | archivo argumentoIN | /*Clase*/ ALIASA argumentoIN;
archivo			: 	ALIASA '.' ALIASA;
argumentoOUT		:	archivo | /*Clase*/ ALIASA; 
opcionesApp		:	'-' ALIASA opcionesApp | '-' ALIASA;
descripcionApp		:	ALIASA | ;

//Lenguaje de expresiones sin recursividad por la izquierda
expresion		:	conjuncion (expresionP | );
expresionP		:	'||' conjuncion (expresionP | );
conjuncion		:	relacion (conjuncionP | );
conjuncionP		:	'&&' relacion (conjuncionP | );
relacion		:	adicion (relacionP | );
relacionP		:	'<' adicion (relacionP | )'<=' adicion (relacionP | )'>' adicion (relacionP | )'>=' adicion (relacionP | )
				'==' adicion (relacionP | )'!=' adicion (relacionP | );
adicion			:	termino (adicionP | );
adicionP		:	'+' termino (adicionP | ) '-' termino (adicionP | );
termino			:	negacion (terminoP | );
terminoP		:	'*' negacion (terminoP | ) | '//' negacion (terminoP | );
negacion		:	factor | '!'factor;
factor			:	ALIASA | tripleta | literal | '(' expresion  ')';

//Lenguaje de funciones

listLengFns		:	'%=' literal ALIASA '(' literal ALIASA (','(literal ALIASA))* ')' '{' instrucciones '}' '=%';
literal			:	Int | Bool | Fecha | Hora | file | listLengClases | String;
Int			:	('1'..'9')('0'..'9')*;
Bool			:	'true' | 'false';
ALIASA			:	(('a'..'z') | ('A'..'Z'))(('a'..'z') | ('A'..'Z') | ('0'..'9'))*;
file			:	relativa | absoluta;
String			:	(('a'..'z')|('A'..'Z')|('0'..'9'))*;
z			:	listVariables listInstrucciones | ;
listVariables		:	(lengVar)+;
lengVar			:	LengTipo ALIASA ';';
listInstrucciones 	:	(instrucciones)+ | ;
instrucciones		: 	asignacion | ciclo | condicion;
condicion		:	condicionP 'else' '{' listInstrucciones '}';
condicionP		:	'if' '(' expresion ')' '{' listInstrucciones '}';
ciclo			:	'while' '(' expresion ')' '{' listInstrucciones '}';
asignacion 		:	ALIASA '~' expresion ';';

//Id			:	(('0'..'9'))+;


//ALIASE		: 	(('a'..'z') | ('A'..'Z') | ('0'..'9'))*;

