package com.study.domain.memberOld;

import java.util.List;

public interface MemberOldRepository /*extends JpaRepository<Member, Long>*/ {

    public MemberOld findMemberByName(String name);

    public List<MemberOld> findMemberByGender(Gender gender);
}
