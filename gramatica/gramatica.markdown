#GramaticaMD = {

		V =	{ LenguajeTotal, LenA, LenClases, LenC,LenFnLenAppCommentsAliasADescripcionIntLiteralBoolDateHourFileStringOpcionesAUbicacionA
			AbsolutaRelativaFechaCreacionFechaEditHoraCreacionHoraEditPropiedadTripletaUbicacionCComandoArgumentoINArchivoClase
			ArgumentoOUTOpcionesAppExpresionConjuncionRelacionAdicionTerminoNegacionFactorInstruccionesListVariablesLengVar
			RestroInstruccionesLogicaCondicionalesCiclosAsignacion }

		∑ = {}

		S = {LenguajeTotal}

		P = {
=====================================================================================================================
		AliasA				--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9])*
		Descripcion			--> ([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|(' '|'\t'))*
		Int					--> ([1-9])([0-9])*
		Literal				--> Int | Bool | Date | Hour | File | /*nombre de clase*/ALIASA | String
		Bool				--> 'true' | 'false'
		Date				--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4})
		Hour				--> [0-9]{2}':'[0-9]{2}':'[0-9]{2}
		File				--> UbicacionA
		String				--> ([a-z]|[A-Z]|[0-9])*
=====================================================================================================================
		LenguajeTotal	 	--> (LenA | LenClases | LenC | LenFn | LenApp | Comments )+
=====================================================================================================================
		Comments			--> '/*' Descripcion '*/'
=====================================================================================================================
		LenA 				--> '$' AliasA '.' AliasA OpcionesA '$$'
		OpcionesA			--> '{' UbicacionA FechaCreacion FechaEdit HoraCreacion HoraEdit '}'
		UbicacionA			--> Relativa | Absoluta | ε
		Absoluta			--> ('/'AliasA)+	
		Relativa			--> '.'(/AliasA)+ | '..'(/AliasA)+
		FechaCreacion		--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ε
		FechaEdit			--> ([0-9]{2} '/' [0-9]{2} '/' [0-9]{4}) | ε
		HoraCreacion		--> [0-9]{2}':'[0-9]{2}':'[0-9]{2} | ε
		HoraEdit			--> [0-9]{2}':'[0-9]{2}':'[0-9]{2} | ε	
=====================================================================================================================
		LenClases			--> '%' AliasA '"' Descripcion '"' Propiedad '%%'
		Propiedad			--> (Tripleta)+
		Tripleta			--> LengTipo ':' AliasA '~' Expresion ','
=====================================================================================================================
		LenC				--> '¿' 'nombre' '~' AliasA '~' UbicacionC '?'
		UbicacionC			--> ('/'AliasA)+'/'
=====================================================================================================================		
		LenApp				--> '#' Int Comando '<<' ArgumentoIN '<<' '>>' ArgumentoOUT '>>' OpcionesApp '"' Descripcion '"' '##'
		Comando				--> AliasA
		ArgumentoIN			--> Archivo | Clase | Archivo ArgumentoIN | Clase ArgumentoIN
		Archivo				--> AliasA '.' AliasA
		Clase				--> AliasA
		ArgumentoOUT		--> Archivo | Clase 
		OpcionesApp			--> '-' AliasA OpcionesApp | '-' AliasA
=====================================================================================================================
		Expresion			--> Conjuncion | Expresion || Conjuncion
		Conjuncion			--> Relacion | Conjuncion && Relacion
		Relacion			--> A 	dicion | Relacion < Adicion 
								| Relacion <= Adicion | Relacion > Adicion 
								| Relacion >= Adicion | Relacion == Adicion
								| Relacion != Adicion
		Adicion				--> Termino | Adicion + Termino | Adicion - Termino
		Termino				--> Negacion | Termino * Negacion | Temino / Negacion
		Negacion			--> Factor | !Factor
		Factor				--> Identificador | Propiedad | Literal | '(' Expresion ')'
=====================================================================================================================
		LenFn				--> '%=' LengTipo AliasA '(' LengTipo AliasA (','(LengTipo AliasA))*')' 
								'{' Instrucciones '}' '=%'
		Instrucciones		--> ListVariables RestoInstrucciones | ε
		ListVariables		--> (LenVar)+
		LengVar				--> LengTipo AliasA ';'
		RestoInstrucciones 	--> (Logica)+ | ε
		Logica				--> Condicionales | Ciclos | Asignaciones
		Condicionales		--> 'if''('Expresion')' '{' Logica '}'
								| 'if''('Expresion')' '{' Logica '}' 'else'
								'{' Logica '}'
		Ciclos				--> 'while' '(' Expresion ')' '{' Logica '}'
		Asignacion 			--> AliasA '~' Expresion ';'

	}
=====================================================================================================================

#}

#Keys:
	V -> No Terminales
	∑ -> Terminales
	S -> Axioma
	P -> Reglas sintácticas
