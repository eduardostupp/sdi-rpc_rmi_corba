package financeiro;


/**
* financeiro/contaCorrenteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from financeiro.idl
* Quinta-feira, 21 de Setembro de 2023 20h06min13s BRT
*/

public interface contaCorrenteOperations 
{
  boolean credita (float valor);
  boolean debita (float valor);
  String getSituacao ();
  boolean setSituacao (String msd);
} // interface contaCorrenteOperations
