grammar md;

prog    		:       md EOF;
md			:	(listLengArchivo | listLengClases | listLengComandos | listLengFns | listLengApp)+;

//Elementos comunes
ALIASA		:	(['a'..'z'] | ['A'..'Z'])(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])*;
ALIASE		: 	(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])*;

//Lenguaje de archivos

listLengArchivo		:	lenA listLengArchivo | ;
lenA 			:	'$' ALIASA '.' ALIASE opcionesA '$$';
opcionesA		:	'{' ubicacionA FechaCreacion FechaEdit HoraCreacion HoraEdit '}';
ubicacionA		:	relativa | absoluta | ;
absoluta		:	('/'ALIASA)+;
relativa		:	'.'('/'ALIASA)+ | '..'('/'ALIASA)+;
FechaCreacion		:	([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ;
FechaEdit		:	([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ;
HoraCreacion		:	[0-9]{2}':'[0-9]{2}':'[0-9]{2} | ;
HoraEdit		:	[0-9]{2}':'[0-9]{2}':'[0-9]{2} | ;

//Lenguaje de clases
listLengClases		:	lenClases listLengClases | ;
lenClases		:	'class' ALIASA DescripcionClases propiedad '/class';
DescripcionClases	:	(['a'..'z'] | ['A'..'Z'] | ['0'..'9'])+;
propiedad		:	tripleta(','tripleta)*;
tripleta		:	literal ':' ALIASA '~' expresion;

//Lenguaje de comandos
listLengComandos	:	lenC listLengComandos | lenC;
lenC			:	'+' 'nombre' '~' ALIASA 'dir' '~' UbicacionC '++';
UbicacionC		:	('/'ALIASA)+'/';

//Lenguaje de aplicación 
listLengApp		:	lenApp listLengApp | lenApp;
lenApp			:	'#' Id /*Comandos*/ ALIASA 'in' argumentoIN '/in' 'out' argumentoOUT '/out' opcionesApp descripcionApp '##';
Id			:	(['0'..'9'])+;
argumentoIN		:	archivo | /*Clase*/ ALIASA | archivo argumentoIN | /*Clase*/ ALIASA argumentoIN;
archivo			: 	ALIASA '.' ALIASE;
argumentoOUT		:	archivo | /*Clase*/ ALIASA; 
opcionesApp		:	'-' ALIASA opcionesApp | '-' ALIASA;
descripcionApp		:	ALIASA | ;

//Lenguaje de expresiones sin recursividad por la izquierda
expresion		:	conjuncion expresionP | conjuncion;
expresionP		:	'||' conjuncion expresionP | '||' conjuncion;
conjuncion		:	relacion conjuncionP | relacion;
conjuncionP		:	'&&' relacion conjuncionP | '&&' relacion;
relacion		:	adicion relacionP | adicion;
relacionP		:	'<' adicion relacionP | '<=' adicion relacionP | '>' adicion relacionP | '>=' adicion relacionP 
				| '==' adicion relacionP | '!=' adicion relacionP | '<' adicion  | '<=' adicion | '>' adicion
				| '>=' adicion | '==' adicion | '!=' adicion;
adicion			:	termino adicionP | termino;
adicionP		:	'+' termino adicionP | '-' termino adicionP | '+' termino | '-' termino;
termino			:	negacion terminoP | negacion;
terminoP		:	'*' negacion terminoP | '/' negacion terminoP | '*' negacion | '/' negacion;
negacion		:	factor | '!'factor;
factor			:	Id | propiedad | literal | '(' expresion ')';

//Lenguaje de funciones
listLengFns		:	lenFn listLengFns | lenFn;
lenFn			:	'%=' literal ALIASA '(' literal ALIASA (','(literal ALIASA))* ')' '{' instrucciones '}' '=%';
literal			:	int | bool | date | hour | file | lenClases | string;
int			:	(['0'..'9']*) | expresion;
bool			:	'true' | 'false' | expresion;
date			:	(['0'..'9']{2} '/' ['0'..'9']{2} '/' ['0'..'9']{4}) | expresion;
hour			:	(['0'..'9']{2} ':' ['0'..'9']{2} ':' ['0'..'9']{2}) | expresion;
file			:	relativa | absoluta;
string			:	(['a'..'z']|['A'..'Z']|['0'..'9'])* | expresion;
instrucciones		:	listVariables restoInstrucciones | ;
listVariables		:	lengVar listVariables | lengVar;
lengVar			:	literal ALIASA ';';
restoInstrucciones 	:	listCondicionales restoInstrucciones | listCiclos restoInstrucciones | listAsignaciones restoInstrucciones | ;
listCondicionales	:	'if' '(' expresion ')' '{' restoInstrucciones '}' | 'if''(' expresion ')' '{' restoInstrucciones '}' 'else' '{' restoInstrucciones '}';
listCiclos		:	'while' '(' expresion ')' '{' restoInstrucciones '}';
listAsignaciones	:	lenAsignacion listAsignaciones | lenAsignacion;
lenAsignacion 		:	ALIASA '~' expresion ';';
