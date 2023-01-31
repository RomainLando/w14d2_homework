package com.codeclan.example.filesservices.components;

import com.codeclan.example.filesservices.models.File;
import com.codeclan.example.filesservices.models.Folder;
import com.codeclan.example.filesservices.models.Person;
import com.codeclan.example.filesservices.repositories.FileRepository;
import com.codeclan.example.filesservices.repositories.FolderRepository;
import com.codeclan.example.filesservices.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args){
        Person richard = new Person("Richard");
        personRepository.save(richard);

        Person mel = new Person("Mel");
        personRepository.save(mel);

        Person vanesa = new Person("Vanesa");
        personRepository.save(vanesa);

        Folder images = new Folder("images", richard);
        folderRepository.save(images);

        Folder work = new Folder("work", mel);
        folderRepository.save(work);

        Folder projects = new Folder("projects", mel);
        folderRepository.save(projects);

        Folder downloads = new Folder("downloads", vanesa);
        folderRepository.save(downloads);

        Folder movies = new Folder("movies", vanesa);
        folderRepository.save(movies);

        File file1 = new File("holiday", "png", 324, images);
        fileRepository.save(file1);

        File file2 = new File("family", "png", 363, images);
        fileRepository.save(file2);

        File file3 = new File("calculator", "py", 70, work);
        fileRepository.save(file3);

        File file4 = new File("Birthday", "js", 2265, projects);
        fileRepository.save(file4);

        File file5 = new File("dating", "js", 2412, projects);
        fileRepository.save(file5);

        File file6 = new File("paper", "pdf", 1021, downloads);
        fileRepository.save(file6);

        File file7 = new File("keypair", "zip", 60, downloads);
        fileRepository.save(file7);

        File file8 = new File("shrek", "mov", 96735, movies);
        fileRepository.save(file8);

    }
}
