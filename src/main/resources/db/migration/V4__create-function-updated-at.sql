CREATE  FUNCTION update_updated_at()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = now();
    RETURN NEW;
END;
$$ language 'plpgsql';

CREATE TRIGGER update_courses_updated_at
    BEFORE UPDATE
    ON
        courses
    FOR EACH ROW
EXECUTE PROCEDURE update_updated_at();

CREATE TRIGGER update_disciplines_updated_at
    BEFORE UPDATE
    ON
        disciplines
    FOR EACH ROW
EXECUTE PROCEDURE update_updated_at();

CREATE TRIGGER update_courses_disciplines_updated_at
    BEFORE UPDATE
    ON
        courses_disciplines
    FOR EACH ROW
EXECUTE PROCEDURE update_updated_at();