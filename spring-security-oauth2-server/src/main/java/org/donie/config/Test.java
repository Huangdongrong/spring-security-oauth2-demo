package org.donie.config;

/**
 * Created by donie on 2016/11/16.
 */
public class Test {

    //方法安全，并允许应用简单的基于角色的约束
   /* @EnableGlobalMethodSecurity(prePostEnabled	=	true)
    public	class	MethodSecurityConfig	{ //	... }


    public	interface	BankService	{

    @PreAuthorize("isAnonymous()") public
    Account	readAccount(Long	id);

    @PreAuthorize("isAnonymous()")
    public	Account[]	findAccounts();

    @PreAuthorize("hasAuthority('ROLE_TELLER')")
    public	Account	post(Account	account,	double	amount);*/



   //注解允许的更复杂的操作，扩展  GlobalMethodSecurityConfiguration

    }



