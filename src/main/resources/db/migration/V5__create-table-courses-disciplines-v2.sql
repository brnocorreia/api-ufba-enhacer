DROP TABLE IF EXISTS courses_disciplines;

CREATE TABLE courses_disciplines (
    course_id INT NOT NULL,
    discipline_id INT NOT NULL,

    PRIMARY KEY (course_id, discipline_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (discipline_id) REFERENCES disciplines(discipline_id)
);