package com.example.hanbit.myapp5.member;

import android.app.Activity;

/**
 * Created by jjjnag on 2016-06-16.
 */
public class MemberServiceImpl extends Activity implements MemberService{
    MemberDAO dao = null;
    @Override
    public String signup(MemberBean member) {
        return dao.signup(member);
    }

    @Override
    public MemberBean login(MemberBean member) {
        return dao.login(member);
    }

    @Override
    public MemberBean update(MemberBean member) {
        return dao.update(member);
    }

    @Override
    public String delete(MemberBean member) {
        return dao.delete(member);
    }
}
