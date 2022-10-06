package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.service.IntroService;
import site.metacoding.testproject.web.dto.CMRespDto;
import site.metacoding.testproject.web.dto.IntroInsertDto;

@RequiredArgsConstructor
@Controller
public class IntroController {

    private final IntroService introService;

    @GetMapping("/introForm")
    public String introForm() {
        return "/intro/saveForm";
    }

    @PostMapping("/intro")
    public @ResponseBody CMRespDto<?> insert(@RequestBody IntroInsertDto introInsertDto) {
        introService.기업소개등록(introInsertDto);
        return new CMRespDto<>(1, "기업소개등록 성공", null);
    }
}
