package site.metacoding.testproject.domain.resume;

import java.util.List;

public interface ResumeDao {
    public List<Resume> findAll();
    public Resume findById(Integer resumeId);
    public void insert(Resume resume);
    public void update(Integer resumeId, Resume resume);
    public void deleteById(Integer resumeId);
}
