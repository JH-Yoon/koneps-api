package com.jonghyun.koneps.api.data.openapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface BidNoticeRepository extends JpaRepository<BidNotice, BidNoticeKey> {
    List<BidNotice> findByBidNtceNoContainsOrBidNtceNmContainsOrNtceInsttNmContainsOrDminsttNmContainsOrderByBidNtceDtDesc(String keyword, String keyword1, String keyword2, String keyword3);
}
