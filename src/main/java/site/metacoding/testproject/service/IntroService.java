package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.IntroDao;
import site.metacoding.testproject.web.dto.IntroInsertDto;

@RequiredArgsConstructor
@Service
public class IntroService {

    private final IntroDao introDao;

    public void 기업소개등록(IntroInsertDto introInsertDto) {
        introDao.insert(introInsertDto.toEntity());
    }
}
